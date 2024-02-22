package src;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class WritingResult implements WriteResult{

    String result;
    enum WriteResultStatus{
        SUCCESS,
        FAILURE
    }

    public WritingResult(){
        
    }

    public WritingResult(String result){
        this.result = result;
    }

    public void setResult(String result){
        this.result = result;
    }

    public String getResult(){
        return result;
    }

    @Override
    public src.WriteResult.WriteResultStatus getStatus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStatus'");
    }

    public void writeToFile(String result) throws IOException{
        //This will write a csv file containing the result
        try(FileWriter writer = new FileWriter("result.csv")){
            writer.write(result);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

	@Override
	public int hashCode() {
		return Objects.hash(result);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WritingResult other = (WritingResult) obj;
		return Objects.equals(result, other.result);
	}
    
    
}
