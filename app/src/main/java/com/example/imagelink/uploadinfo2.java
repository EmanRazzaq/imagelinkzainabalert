package com.example.imagelink;

public class uploadinfo2 {

    public String imageName;
    public String imageURL;
    public String imageGender;
    public String imageAge;


    public uploadinfo2(){}

    public uploadinfo2(String name, String gender,String age, String url) {
        this.imageName = name;
        this.imageGender = gender;
        this.imageAge = age;
        this.imageURL = url;

    }

    public String getImageName() {
        return imageName;
    }
    public String getImageGender() {
        return imageGender;
    }
    public String getImageURL() {
        return imageURL;
    }
    public String getImageAge() {
        return imageAge;
    }


}
