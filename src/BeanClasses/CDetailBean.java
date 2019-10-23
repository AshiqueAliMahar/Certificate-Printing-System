package BeanClasses;

public class CDetailBean {
    
    private int id;
    private int issueCertificateId;
    private String appName;
    private String appRelation;
    private String appCNIC;
    private String dateOfBirth;
    private String fatherName;
    private String gender;
    private String husbandCNIC;
    private String husbandName;
    private String maritalStatus;
    private String mobile;
    private String optionalCNIC;
    private String surName;
    private String appAddress;
    private String districtName;
    private int issueCPSNo;
    private String CertificateDate;
    private String certificateDetails;
    private String certificateName;
    private int certificateNo;
    private String recommendedBy;
    private String recommededPerson;
    private String taluka;
    private int wardNum;
    private int applicantId;
    
    public String getCertificateName() {
        return certificateName;
    }
    
    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }
    
    public CDetailBean(){
        
    }
    
    public CDetailBean(int id, String appName, String appRelation, String appCNIC,String dateOfBirth, String fatherName, String gender, String husbandCNIC, String husbandName, String maritalStatus, String mobile, String optionalCNIC, String surName) {
        this.id = id;
        this.appName = appName;
        this.appRelation = appRelation;
        this.appCNIC = appCNIC;
        this.dateOfBirth = dateOfBirth;
        this.fatherName = fatherName;
        this.gender = gender;
        this.husbandCNIC = husbandCNIC;
        this.husbandName = husbandName;
        this.maritalStatus = maritalStatus;
        this.mobile = mobile;
        this.optionalCNIC = optionalCNIC;
        this.surName = surName;
    }
    
    public CDetailBean(int issueCertificateId, String appAddress, String districtName, int issueCPSNo,String CertificateDate, String certificateDetails, String certificateName, int certificateNo, String recommendedBy, String recommededPerson, String taluka, int wardNum, int applicantId) {
        this.issueCertificateId = issueCertificateId;
        this.appAddress = appAddress;
        this.districtName = districtName;
        this.issueCPSNo = issueCPSNo;
        this.CertificateDate = CertificateDate;
        this.certificateDetails = certificateDetails;
        this.certificateName = certificateName;
        this.certificateNo = certificateNo;
        this.recommendedBy = recommendedBy;
        this.recommededPerson = recommededPerson;
        this.taluka = taluka;
        this.wardNum = wardNum;
        this.applicantId = applicantId;
    }
    
    public CDetailBean(int id, int issueCertificateId, String appName, String appRelation, String appCNIC,String dateOfBirth, String fatherName, String gender, String husbandCNIC, String husbandName, String maritalStatus, String mobile, String optionalCNIC, String surName, String appAddress, String districtName, int issueCPSNo,String CertificateDate, String certificateDetails,String certificateName, int certificateNo, String recommendedBy, String recommededPerson, String taluka, int wardNum, int applicantId) {
        this.id = id;
        this.issueCertificateId = issueCertificateId;
        this.appName = appName;
        this.appRelation = appRelation;
        this.appCNIC = appCNIC;
        this.dateOfBirth = dateOfBirth;
        this.fatherName = fatherName;
        this.gender = gender;
        this.husbandCNIC = husbandCNIC;
        this.husbandName = husbandName;
        this.maritalStatus = maritalStatus;
        this.mobile = mobile;
        this.optionalCNIC = optionalCNIC;
        this.surName = surName;
        this.appAddress = appAddress;
        this.districtName = districtName;
        this.issueCPSNo = issueCPSNo;
        this.CertificateDate = CertificateDate;
        this.certificateDetails = certificateDetails;
        this.certificateName=certificateName;
        this.certificateNo = certificateNo;
        this.recommendedBy = recommendedBy;
        this.recommededPerson = recommededPerson;
        this.taluka = taluka;
        this.wardNum = wardNum;
        this.applicantId = applicantId;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIssueCertificateId() {
        return issueCertificateId;
    }

    public void setIssueCertificateId(int issueCertificateId) {
        this.issueCertificateId = issueCertificateId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppRelation() {
        return appRelation;
    }

    public void setAppRelation(String appRelation) {
        this.appRelation = appRelation;
    }

    public String getAppCNIC() {
        return appCNIC;
    }

    public void setAppCNIC(String appCNIC) {
        this.appCNIC = appCNIC;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHusbandCNIC() {
        return husbandCNIC;
    }

    public void setHusbandCNIC(String husbandCNIC) {
        this.husbandCNIC = husbandCNIC;
    }

    public String getHusbandName() {
        return husbandName;
    }

    public void setHusbandName(String husbandName) {
        this.husbandName = husbandName;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOptionalCNIC() {
        return optionalCNIC;
    }

    public void setOptionalCNIC(String optionalCNIC) {
        this.optionalCNIC = optionalCNIC;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getAppAddress() {
        return appAddress;
    }

    public void setAppAddress(String appAddress) {
        this.appAddress = appAddress;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public int getIssueCPSNo() {
        return issueCPSNo;
    }

    public void setIssueCPSNo(int issueCPSNo) {
        this.issueCPSNo = issueCPSNo;
    }

    public String getCertificateDate() {
        return CertificateDate;
    }

    public void setCertificateDate(String CertificateDate) {
        this.CertificateDate = CertificateDate;
    }

    public String getCertificateDetails() {
        return certificateDetails;
    }

    public void setCertificateDetails(String certificateDetails) {
        this.certificateDetails = certificateDetails;
    }

    public int getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(int certificateNo) {
        this.certificateNo = certificateNo;
    }

    public String getRecommendedBy() {
        return recommendedBy;
    }

    public void setRecommendedBy(String recommendedBy) {
        this.recommendedBy = recommendedBy;
    }

    public String getRecommededPerson() {
        return recommededPerson;
    }

    public void setRecommededPerson(String recommededPerson) {
        this.recommededPerson = recommededPerson;
    }

    public String getTaluka() {
        return taluka;
    }

    public void setTaluka(String taluka) {
        this.taluka = taluka;
    }

    public int getWardNum() {
        return wardNum;
    }

    public void setWardNum(int wardNum) {
        this.wardNum = wardNum;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }   
}
