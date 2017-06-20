package com.aqhi.model;

import java.util.Date;

public class EmployeeInfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_info.empl_id
     *
     * @mbg.generated
     */
    private Long empl_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_info.gender
     *
     * @mbg.generated
     */
    private Byte gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_info.true_name
     *
     * @mbg.generated
     */
    private String true_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_info.identify
     *
     * @mbg.generated
     */
    private String identify;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_info.home_address
     *
     * @mbg.generated
     */
    private String home_address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_info.live_address
     *
     * @mbg.generated
     */
    private String live_address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_info.education
     *
     * @mbg.generated
     */
    private String education;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_info.political_status
     *
     * @mbg.generated
     */
    private String political_status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_info.graduated_school
     *
     * @mbg.generated
     */
    private String graduated_school;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_info.telephone
     *
     * @mbg.generated
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_info.qq
     *
     * @mbg.generated
     */
    private String qq;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_info.we_chat
     *
     * @mbg.generated
     */
    private String we_chat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_info.register_time
     *
     * @mbg.generated
     */
    private Date register_time;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee_info
     *
     * @mbg.generated
     */
    public EmployeeInfo(Long empl_id, Byte gender, String true_name, String identify, String home_address, String live_address, String education, String political_status, String graduated_school, String telephone, String qq, String we_chat, Date register_time) {
        this.empl_id = empl_id;
        this.gender = gender;
        this.true_name = true_name;
        this.identify = identify;
        this.home_address = home_address;
        this.live_address = live_address;
        this.education = education;
        this.political_status = political_status;
        this.graduated_school = graduated_school;
        this.telephone = telephone;
        this.qq = qq;
        this.we_chat = we_chat;
        this.register_time = register_time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_info.empl_id
     *
     * @return the value of employee_info.empl_id
     *
     * @mbg.generated
     */
    public Long getEmpl_id() {
        return empl_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_info.gender
     *
     * @return the value of employee_info.gender
     *
     * @mbg.generated
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_info.true_name
     *
     * @return the value of employee_info.true_name
     *
     * @mbg.generated
     */
    public String getTrue_name() {
        return true_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_info.identify
     *
     * @return the value of employee_info.identify
     *
     * @mbg.generated
     */
    public String getIdentify() {
        return identify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_info.home_address
     *
     * @return the value of employee_info.home_address
     *
     * @mbg.generated
     */
    public String getHome_address() {
        return home_address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_info.live_address
     *
     * @return the value of employee_info.live_address
     *
     * @mbg.generated
     */
    public String getLive_address() {
        return live_address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_info.education
     *
     * @return the value of employee_info.education
     *
     * @mbg.generated
     */
    public String getEducation() {
        return education;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_info.political_status
     *
     * @return the value of employee_info.political_status
     *
     * @mbg.generated
     */
    public String getPolitical_status() {
        return political_status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_info.graduated_school
     *
     * @return the value of employee_info.graduated_school
     *
     * @mbg.generated
     */
    public String getGraduated_school() {
        return graduated_school;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_info.telephone
     *
     * @return the value of employee_info.telephone
     *
     * @mbg.generated
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_info.qq
     *
     * @return the value of employee_info.qq
     *
     * @mbg.generated
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_info.we_chat
     *
     * @return the value of employee_info.we_chat
     *
     * @mbg.generated
     */
    public String getWe_chat() {
        return we_chat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_info.register_time
     *
     * @return the value of employee_info.register_time
     *
     * @mbg.generated
     */
    public Date getRegister_time() {
        return register_time;
    }
}