package com.example.myapplication.sales;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ContactModel {

    @SerializedName("userlist")
    @Expose
    private List<User> userlist;

    public List<User> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<User> userlist) {
        this.userlist = userlist;
    }

    public class User {

        @SerializedName("user_name")
        @Expose
        private String userName;
        @SerializedName("emp_id")
        @Expose
        private String empId;
        @SerializedName("designation")
        @Expose
        private String designation;
        @SerializedName("department")
        @Expose
        private String department;
        @SerializedName("ofc_mobile")
        @Expose
        private String ofcMobile;
        @SerializedName("personal_mobile")
        @Expose
        private String personalMobile;
        @SerializedName("ofc_email")
        @Expose
        private String ofcEmail;
        @SerializedName("pesrsonal_email")
        @Expose
        private String pesrsonalEmail;
        @SerializedName("ratings")
        @Expose
        private String ratings;
        @SerializedName("ratedby")
        @Expose
        private String ratedby;
        @SerializedName("image")
        @Expose
        private String image;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getEmpId() {
            return empId;
        }

        public void setEmpId(String empId) {
            this.empId = empId;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getOfcMobile() {
            return ofcMobile;
        }

        public void setOfcMobile(String ofcMobile) {
            this.ofcMobile = ofcMobile;
        }

        public String getPersonalMobile() {
            return personalMobile;
        }

        public void setPersonalMobile(String personalMobile) {
            this.personalMobile = personalMobile;
        }

        public String getOfcEmail() {
            return ofcEmail;
        }

        public void setOfcEmail(String ofcEmail) {
            this.ofcEmail = ofcEmail;
        }

        public String getPesrsonalEmail() {
            return pesrsonalEmail;
        }

        public void setPesrsonalEmail(String pesrsonalEmail) {
            this.pesrsonalEmail = pesrsonalEmail;
        }

        public String getRatings() {
            return ratings;
        }

        public void setRatings(String ratings) {
            this.ratings = ratings;
        }

        public String getRatedby() {
            return ratedby;
        }

        public void setRatedby(String ratedby) {
            this.ratedby = ratedby;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

    }
}