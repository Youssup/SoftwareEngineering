package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import scienceRules.ComputeCoordinatorGrpc;
import scienceRules.ComputeCoordinatorOuterClass.ComputingResult;

public class ComputeClient {
    private ComputeCoordinatorGrpc.ComputeCoordinatorBlockingStub blockingStub;
    private JTextField filePathField;
    private JTextArea resultArea;

    public ComputeClient(Channel channel) {
        blockingStub = ComputeCoordinatorGrpc.newBlockingStub(channel);
        JFrame frame = new JFrame("ComputeClientGUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        filePathField = new JTextField(20);
        JButton computeButton = new JButton("Compute");
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(new JLabel("File path:"));
        panel.add(filePathField);
        panel.add(computeButton);
        panel.add(new JScrollPane(resultArea));

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);

        computeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compute(filePathField.getText(), ',');
            }
        });
    }

    public void compute(String path, char delimiter) {
        scienceRules.DataStorageAPIOuterClass.FileInput fileInput =
                scienceRules.DataStorageAPIOuterClass.FileInput.newBuilder().
                setPath(path).build();
        scienceRules.ComputeCoordinatorOuterClass.ComputeRequest request =
                scienceRules.ComputeCoordinatorOuterClass.ComputeRequest.
                newBuilder().setFileInput(fileInput)
                        .setDelimiter(Character.toString(delimiter)).build();

        try {
            ComputingResult response = blockingStub.run(request);
            if (response.isInitialized()) {
                resultArea.setText("Initialized:\n" + response.toString());
            } else {
                resultArea.setText("Error: Response not initialized.");
            }
        } catch (StatusRuntimeException e) {
            resultArea.setText("Failed to call gRPC server: " + e.getStatus().
            		getDescription());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        String target = "localhost:55504";
        ManagedChannel channel =
                Grpc.newChannelBuilder(target, InsecureChannelCredentials.create()).build();
        try {
            new ComputeClient(channel);
        } finally {
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                try {
                    channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }));
        }
    }
}