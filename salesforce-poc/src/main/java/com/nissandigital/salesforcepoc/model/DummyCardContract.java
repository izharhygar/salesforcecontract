package com.nissandigital.salesforcepoc.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity
@Table(name = "Dummy_CardContract")
@JsonDeserialize
public class DummyCardContract implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name ="ContractID")
	private String contractID;
	@Column(name="CardNumberHouse")
	private String cardNumberHouse;
	@Column(name="CardBranchNumberHouse")
	private String cardBranchNumberHouse;
	@Column(name="Sid")
	private String sid;
	@Column(name="CardNumberEtc")
	private String cardNumberEtc;
	@Column(name="CardNumberCharge")
	private String cardNumberCharge;
	@Column(name="CardType")
	private String cardType;
	@Column(name="FamilyCardAttachedStatus")
	private Boolean familyCardAttachedStatus;
	@Column(name="EtcCardAttachedStatus")
	private Boolean etcCardAttachedStatus;
	@Column(name="ChargeCardAttachedStatus")
	private Boolean chargeCardAttachedStatus;
	@Column(name="IssueCategory")
	private String issueCategory;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name="CardIssueDate")
	private Date cardIssueDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name="ApplicationDate")
	private Date applicationDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name="CardEnrollmentDate")
	private Date cardEnrollmentDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date memberEnrollmentDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date resignationCompleteDate;
	private String resignationReason;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date cardTradeDate;
	private String invalidReason;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date invalidRegistration;
	private String recalledReason;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date cardRecalledDate;
	private String cardNotReceivedReason;
	private Boolean addressDefect;
	private String updateReason;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date updateDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date repostDate;
	private String bankAccountStatus;
	private String bankName;
	private String bankBranchName;
	private String bankAccountType;
	private String bankAccountNumber;
	private String bankAccountHolder;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date expirationDate;
	private int annualFee;
	private int cardLostTimes;
	private String updatedCardShippingStatus;
	private Boolean annualNotCharged;
	private Boolean feeNotCharged;
	private Boolean usageAmountNotCharged;
	private String carManufacturerName;
	private String carModelName;
	private String carRegistrationNumber;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date carFirstRegistrationDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date carRegistrationDate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date carInspectionExpirationDate;
	private String salesCompanyName;
	private String salesCompanyShopName;
	private String contractType;
	private String contractMainType;
	private String CustomerID;
	
	
	//getters and setters
	public String getContractID() {
		return contractID;
	}
	public void setContractID(String contractID) {
		this.contractID = contractID;
	}
	public String getCardNumberHouse() {
		return cardNumberHouse;
	}
	public void setCardNumberHouse(String cardNumberHouse) {
		this.cardNumberHouse = cardNumberHouse;
	}
	public String getCardBranchNumberHouse() {
		return cardBranchNumberHouse;
	}
	public void setCardBranchNumberHouse(String cardBranchNumberHouse) {
		this.cardBranchNumberHouse = cardBranchNumberHouse;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getCardNumberEtc() {
		return cardNumberEtc;
	}
	public void setCardNumberEtc(String cardNumberEtc) {
		this.cardNumberEtc = cardNumberEtc;
	}
	public String getCardNumberCharge() {
		return cardNumberCharge;
	}
	public void setCardNumberCharge(String cardNumberCharge) {
		this.cardNumberCharge = cardNumberCharge;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public Boolean getFamilyCardAttachedStatus() {
		return familyCardAttachedStatus;
	}
	public void setFamilyCardAttachedStatus(Boolean familyCardAttachedStatus) {
		this.familyCardAttachedStatus = familyCardAttachedStatus;
	}
	public Boolean getEtcCardAttachedStatus() {
		return etcCardAttachedStatus;
	}
	public void setEtcCardAttachedStatus(Boolean etcCardAttachedStatus) {
		this.etcCardAttachedStatus = etcCardAttachedStatus;
	}
	public Boolean getChargeCardAttachedStatus() {
		return chargeCardAttachedStatus;
	}
	public void setChargeCardAttachedStatus(Boolean chargeCardAttachedStatus) {
		this.chargeCardAttachedStatus = chargeCardAttachedStatus;
	}
	public String getIssueCategory() {
		return issueCategory;
	}
	public void setIssueCategory(String issueCategory) {
		this.issueCategory = issueCategory;
	}
	public Date getCardIssueDate() {
		return cardIssueDate;
	}
	public void setCardIssueDate(Date cardIssueDate) {
		this.cardIssueDate = cardIssueDate;
	}
	public Date getApplicationDate() {
		return applicationDate;
	}
	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}
	public Date getCardEnrollmentDate() {
		return cardEnrollmentDate;
	}
	public void setCardEnrollmentDate(Date cardEnrollmentDate) {
		this.cardEnrollmentDate = cardEnrollmentDate;
	}
	public Date getMemberEnrollmentDate() {
		return memberEnrollmentDate;
	}
	public void setMemberEnrollmentDate(Date memberEnrollmentDate) {
		this.memberEnrollmentDate = memberEnrollmentDate;
	}
	public Date getResignationCompleteDate() {
		return resignationCompleteDate;
	}
	public void setResignationCompleteDate(Date resignationCompleteDate) {
		this.resignationCompleteDate = resignationCompleteDate;
	}
	public String getResignationReason() {
		return resignationReason;
	}
	public void setResignationReason(String resignationReason) {
		this.resignationReason = resignationReason;
	}
	public Date getCardTradeDate() {
		return cardTradeDate;
	}
	public void setCardTradeDate(Date cardTradeDate) {
		this.cardTradeDate = cardTradeDate;
	}
	public String getInvalidReason() {
		return invalidReason;
	}
	public void setInvalidReason(String invalidReason) {
		this.invalidReason = invalidReason;
	}
	public Date getInvalidRegistration() {
		return invalidRegistration;
	}
	public void setInvalidRegistration(Date invalidRegistration) {
		this.invalidRegistration = invalidRegistration;
	}
	public String getRecalledReason() {
		return recalledReason;
	}
	public void setRecalledReason(String recalledReason) {
		this.recalledReason = recalledReason;
	}
	public Date getCardRecalledDate() {
		return cardRecalledDate;
	}
	public void setCardRecalledDate(Date cardRecalledDate) {
		this.cardRecalledDate = cardRecalledDate;
	}
	public String getCardNotReceivedReason() {
		return cardNotReceivedReason;
	}
	public void setCardNotReceivedReason(String cardNotReceivedReason) {
		this.cardNotReceivedReason = cardNotReceivedReason;
	}
	public Boolean getAddressDefect() {
		return addressDefect;
	}
	public void setAddressDefect(Boolean addressDefect) {
		this.addressDefect = addressDefect;
	}
	public String getUpdateReason() {
		return updateReason;
	}
	public void setUpdateReason(String updateReason) {
		this.updateReason = updateReason;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Date getRepostDate() {
		return repostDate;
	}
	public void setRepostDate(Date repostDate) {
		this.repostDate = repostDate;
	}
	public String getBankAccountStatus() {
		return bankAccountStatus;
	}
	public void setBankAccountStatus(String bankAccountStatus) {
		this.bankAccountStatus = bankAccountStatus;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankBranchName() {
		return bankBranchName;
	}
	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}
	public String getBankAccountType() {
		return bankAccountType;
	}
	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getBankAccountHolder() {
		return bankAccountHolder;
	}
	public void setBankAccountHolder(String bankAccountHolder) {
		this.bankAccountHolder = bankAccountHolder;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public int getAnnualFee() {
		return annualFee;
	}
	public void setAnnualFee(int annualFee) {
		this.annualFee = annualFee;
	}
	public int getCardLostTimes() {
		return cardLostTimes;
	}
	public void setCardLostTimes(int cardLostTimes) {
		this.cardLostTimes = cardLostTimes;
	}
	public String getUpdatedCardShippingStatus() {
		return updatedCardShippingStatus;
	}
	public void setUpdatedCardShippingStatus(String updatedCardShippingStatus) {
		this.updatedCardShippingStatus = updatedCardShippingStatus;
	}
	public Boolean getAnnualNotCharged() {
		return annualNotCharged;
	}
	public void setAnnualNotCharged(Boolean annualNotCharged) {
		this.annualNotCharged = annualNotCharged;
	}
	public Boolean getFeeNotCharged() {
		return feeNotCharged;
	}
	public void setFeeNotCharged(Boolean feeNotCharged) {
		this.feeNotCharged = feeNotCharged;
	}
	public Boolean getUsageAmountNotCharged() {
		return usageAmountNotCharged;
	}
	public void setUsageAmountNotCharged(Boolean usageAmountNotCharged) {
		this.usageAmountNotCharged = usageAmountNotCharged;
	}
	public String getCarManufacturerName() {
		return carManufacturerName;
	}
	public void setCarManufacturerName(String carManufacturerName) {
		this.carManufacturerName = carManufacturerName;
	}
	public String getCarModelName() {
		return carModelName;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public String getCarRegistrationNumber() {
		return carRegistrationNumber;
	}
	public void setCarRegistrationNumber(String carRegistrationNumber) {
		this.carRegistrationNumber = carRegistrationNumber;
	}
	public Date getCarFirstRegistrationDate() {
		return carFirstRegistrationDate;
	}
	public void setCarFirstRegistrationDate(Date carFirstRegistrationDate) {
		this.carFirstRegistrationDate = carFirstRegistrationDate;
	}
	public Date getCarRegistrationDate() {
		return carRegistrationDate;
	}
	public void setCarRegistrationDate(Date carRegistrationDate) {
		this.carRegistrationDate = carRegistrationDate;
	}
	public Date getCarInspectionExpirationDate() {
		return carInspectionExpirationDate;
	}
	public void setCarInspectionExpirationDate(Date carInspectionExpirationDate) {
		this.carInspectionExpirationDate = carInspectionExpirationDate;
	}
	public String getSalesCompanyName() {
		return salesCompanyName;
	}
	public void setSalesCompanyName(String salesCompanyName) {
		this.salesCompanyName = salesCompanyName;
	}
	public String getSalesCompanyShopName() {
		return salesCompanyShopName;
	}
	public void setSalesCompanyShopName(String salesCompanyShopName) {
		this.salesCompanyShopName = salesCompanyShopName;
	}
	public String getContractType() {
		return contractType;
	}
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}
	public String getContractMainType() {
		return contractMainType;
	}
	public void setContractMainType(String contractMainType) {
		this.contractMainType = contractMainType;
	}
	public String getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}
	
	//default constructor
	public DummyCardContract() {}
	
	//constructor with fields
	public DummyCardContract(String contractID, String cardNumberHouse, String cardBranchNumberHouse, String sid,
			String cardNumberEtc, String cardNumberCharge, String cardType, Boolean familyCardAttachedStatus,
			Boolean etcCardAttachedStatus, Boolean chargeCardAttachedStatus, String issueCategory, Date cardIssueDate,
			Date applicationDate, Date cardEnrollmentDate, Date memberEnrollmentDate, Date resignationCompleteDate,
			String resignationReason, Date cardTradeDate, String invalidReason, Date invalidRegistration,
			String recalledReason, Date cardRecalledDate, String cardNotReceivedReason, Boolean addressDefect,
			String updateReason, Date updateDate, Date repostDate, String bankAccountStatus, String bankName,
			String bankBranchName, String bankAccountType, String bankAccountNumber, String bankAccountHolder,
			Date expirationDate, int annualFee, int cardLostTimes, String updatedCardShippingStatus,
			Boolean annualNotCharged, Boolean feeNotCharged, Boolean usageAmountNotCharged, String carManufacturerName,
			String carModelName, String carRegistrationNumber, Date carFirstRegistrationDate, Date carRegistrationDate,
			Date carInspectionExpirationDate, String salesCompanyName, String salesCompanyShopName, String contractType,
			String contractMainType, String customerID) {
		super();
		this.contractID = contractID;
		this.cardNumberHouse = cardNumberHouse;
		this.cardBranchNumberHouse = cardBranchNumberHouse;
		this.sid = sid;
		this.cardNumberEtc = cardNumberEtc;
		this.cardNumberCharge = cardNumberCharge;
		this.cardType = cardType;
		this.familyCardAttachedStatus = familyCardAttachedStatus;
		this.etcCardAttachedStatus = etcCardAttachedStatus;
		this.chargeCardAttachedStatus = chargeCardAttachedStatus;
		this.issueCategory = issueCategory;
		this.cardIssueDate = cardIssueDate;
		this.applicationDate = applicationDate;
		this.cardEnrollmentDate = cardEnrollmentDate;
		this.memberEnrollmentDate = memberEnrollmentDate;
		this.resignationCompleteDate = resignationCompleteDate;
		this.resignationReason = resignationReason;
		this.cardTradeDate = cardTradeDate;
		this.invalidReason = invalidReason;
		this.invalidRegistration = invalidRegistration;
		this.recalledReason = recalledReason;
		this.cardRecalledDate = cardRecalledDate;
		this.cardNotReceivedReason = cardNotReceivedReason;
		this.addressDefect = addressDefect;
		this.updateReason = updateReason;
		this.updateDate = updateDate;
		this.repostDate = repostDate;
		this.bankAccountStatus = bankAccountStatus;
		this.bankName = bankName;
		this.bankBranchName = bankBranchName;
		this.bankAccountType = bankAccountType;
		this.bankAccountNumber = bankAccountNumber;
		this.bankAccountHolder = bankAccountHolder;
		this.expirationDate = expirationDate;
		this.annualFee = annualFee;
		this.cardLostTimes = cardLostTimes;
		this.updatedCardShippingStatus = updatedCardShippingStatus;
		this.annualNotCharged = annualNotCharged;
		this.feeNotCharged = feeNotCharged;
		this.usageAmountNotCharged = usageAmountNotCharged;
		this.carManufacturerName = carManufacturerName;
		this.carModelName = carModelName;
		this.carRegistrationNumber = carRegistrationNumber;
		this.carFirstRegistrationDate = carFirstRegistrationDate;
		this.carRegistrationDate = carRegistrationDate;
		this.carInspectionExpirationDate = carInspectionExpirationDate;
		this.salesCompanyName = salesCompanyName;
		this.salesCompanyShopName = salesCompanyShopName;
		this.contractType = contractType;
		this.contractMainType = contractMainType;
		CustomerID = customerID;
	}
	
	

}