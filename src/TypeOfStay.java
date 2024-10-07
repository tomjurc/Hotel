public enum TypeOfStay {
    VACATION("Vacation"),
    WORKTRIP("Work trip");

    private String stay;

    private TypeOfStay(String stay){
        this.stay = stay;
    }

    public String getStay(){
        return this.stay;
    }
}
