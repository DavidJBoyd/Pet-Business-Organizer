
public class Monkey extends RescueAnimal {

    // Instance variables
	private String species;
    private double tailLength;
    private double height;
    private double bodyLength;
    
    // Constructor
    public Monkey(String name, String species, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry,
    double tailLength, double height, double bodyLength) {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);

    }

    // Accessor Methods
    public String getSpecies() {
        return species;
    }
    
    public double gettailLength() {
    	return tailLength;
    }
    
    public double getHeight() {
    	return height;
    }
    
    public double getbodyLength() {
    	return bodyLength;
    }
    
    // Mutator Methods
    public void setSpecies(String monkeyBreed) {
        species = monkeyBreed;
    }
    
    public void settailLength(double x) {
    	tailLength = x;
    }
    
    public void setHeight(double x) {
    	height = x;
    }
    
    public void setbodyLength(double x) {
    	bodyLength = x;
    }

}