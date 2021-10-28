package com.taim.conduire.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Table(name = "shopee_order")
@Entity
public class ShopeeOrderData implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "account_id")
	private Integer accountId;

	@Column(name = "ordersn")
	private String ordersn;

	@Column(name = "created_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	@Column(name = "updated_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedAt;

	@Column(name = "estimated_shipping_fee")
	private String estimatedShippingFee;

	@Column(name = "order_flag")
	private String orderFlag;

	@Column(name = "payment_method")
	private String paymentMethod;

	@Column(name = "message_to_seller")
	private String messageToSeller;

	@Column(name = "shipping_carrier")
	private String shippingCarrier;

	@Column(name = "currency")
	private String currency;

	@Column(name = "pay_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date payTime;

	@Column(name = "note")
	private String note;

	@Column(name = "credit_card_number")
	private String creditCardNumber;

	@Column(name = "days_to_ship")
	private Integer daysToShip;

	@Column(name = "is_split_up")
	private Boolean isSplitUp;

	@Column(name = "ship_by_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date shipByDate;

	@Column(name = "escrow_tax")
	private String escrowTax;

	@Column(name = "tracking_no")
	private String trackingNo;

	@Column(name = "order_status")
	private String orderStatus;

	@Column(name = "note_update_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date noteUpdateTime;

	@Column(name = "fm_tn")
	private String fmTn;

	@Column(name = "dropshipper_phone")
	private String dropshipperPhone;

	@Column(name = "cancel_reason")
	private String cancelReason;

	@Column(name = "checkout_shipping_carrier")
	private String checkoutShippingCarrier;

	@Column(name = "cancel_by")
	private String cancelBy;

	@Column(name = "escrow_amount")
	private String escrowAmount;

	@Column(name = "buyer_cancel_reason")
	private String buyerCancelReason;

	@Column(name = "goods_to_declare")
	private Boolean goodsToDeclare;

	@Column(name = "lm_tn")
	private String lmTn;

	@Column(name = "total_amount")
	private String totalAmount;

	@Column(name = "discount")
	private String discount;

	@Column(name = "service_code")
	private String serviceCode;

	@Column(name = "actual_shipping_cost")
	private String actualShippingCost;

	@Column(name = "is_cod")
	private Boolean isCod;

	@Column(name = "dropshipper")
	private String dropshipper;

	@Column(name = "is_actual_shipping_fee_confirmed")
	private Boolean isActualShippingFeeConfirmed;

	@Column(name = "buyer_username")
	private String buyerUsername;

	@Column(name = "town")
	private String town;

	@Column(name = "city")
	private String city;

	@Column(name = "name")
	private String name;

	@Column(name = "district")
	private String district;

	@Column(name = "country")
	private String country;

	@Column(name = "zipcode")
	private String zipcode;

	@Column(name = "full_address")
	private String fullAddress;

	@Column(name = "phone")
	private String phone;

	@Column(name = "state")
	private String state;

	@Column(name = "new_order_status")
	private String newOrderStatus;

	@Column(name = "new_shipping_status")
	private String newShippingStatus;

	@Column(name = "transaction_tags")
	private String transactionTags;

	@Column(name = "order_tags")
	private String orderTags;

	@Column(name = "shipping_label_url")
	private String shippingLabelUrl;
	
	@Column(name = "shipping_label")
	private String shippingLabel;
	
	@Column(name = "print_shipping_label")
	private String printShippingLabel;
	
	@Column(name = "is_traking_number")
	private Boolean isTrakingNumber;
	
	@Column(name = "is_airway_bill")
	private Boolean isAirWayBill;
	
	@Column(name = "is_download_shipping_label")
	private Boolean isDownloadShippingLabel;

}
