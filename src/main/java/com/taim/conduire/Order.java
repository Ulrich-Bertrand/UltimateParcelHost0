package com.taim.conduire;

import java.io.Serializable;
import java.util.Date;


public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String ordersn;
    private String country;
    private Boolean cod;
    private String trackingNo;
    private Integer daysToShip;
    private String recipientAddressName;
    private String recipientAddressphone;
    private String recipientAddressTown;
    private String recipientAddressDistrict;
    private String recipientAddressCity;
    private String recipientAddressState;
    private String recipientAddressCountry;
    private String recipientAddressZipcode;
    private String recipientAddressFullAddress;
    private String actualShippingCost;
    private String estimatedShippingFee;
    private String escrowTax;
    private String totalAmount;
    private String escrowAmount;
    private String orderStatus;
    private String shippingCarrier;
    private String checkoutShippingCarrier;
    private String paymentMethod;
    private Boolean goodsToDeclare;
    private String messageToSeller;
    private String note;
    private Date noteUpdateTime;
    private Date create_time;
    private Date update_time;
    private Date payTime;
    private String dropshipper;
    private String buyerUsername;
    private String dropshipperPhone;
    private Boolean isSplitUp;
    private Date shipByDate;
    private String buyerCancelReason;
    private Boolean isActualShippingFeeConfirmed;
    private String fmTn;
    private String lmTn;
    private String cancelBy;
    private String cancelReason;
    private String serviceCode;
    private String orderFlag;
    private String reverseShippingFee ;
    private Integer accountId;

}