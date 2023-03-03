public class Address {
    private String unitno;
    private String street;
    private String postcode;
    private String district;
    private String state;

    public Address(String unitno,String street,String postcode,String district,String state){
        this.unitno = unitno;
        this.street = street;
        this.postcode =postcode;
        this.district =district;
        this.state = state;
    }
    public String getUnitno() {
        return unitno;
    }

    public void setUnitno(String unitno) {
        this.unitno = unitno;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
