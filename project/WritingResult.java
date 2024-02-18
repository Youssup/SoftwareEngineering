package project;

public class WritingResult implements WriteResult{

    String result;
    enum WriteResultStatus{
        SUCCESS,
        FAILURE
    }

    public WritingResult(){
        
    }

    public void setResult(String result){
        this.result = result;
    }

    public String getResult(){
        return result;
    }

    @Override
    public project.WriteResult.WriteResultStatus getStatus() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStatus'");
    }
    
}
