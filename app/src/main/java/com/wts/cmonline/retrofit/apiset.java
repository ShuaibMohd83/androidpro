package com.wts.cmonline.retrofit;

import com.google.gson.JsonObject;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface apiset {
    // we can add further different API List Below
    // below code call login API

    @FormUrlEncoded
    @POST("UserLogin") // Here Give File Name of Api
    Call<JsonObject> getlogin(@Header("Authorization") String auth,

                              @Field("userName") String username, // This userName parameter give to Postmen tool
                              @Field("password") String password,
                              @Field("tokenKey") String token,
                              @Field("deviceInfo") String DeviceInfo);

    @FormUrlEncoded
    @POST("CheckCredientials")
    Call<JsonObject> checkCredential(@Header("Authorization") String auth,
                                     @Field("userName") String userName,
                                     @Field("password") String password,
                                     @Field("deviceID") String deviceID);

    @FormUrlEncoded
    @POST("GetUserBalance") // Here Give File Name of Api
    Call<JsonObject> getBalance(@Header("Authorization") String auth,
                                @Field("userID") String userID,
                                @Field("tokenKey") String tokenKey,
                                @Field("deviceInfo") String DeviceInfo,
                                @Field("action") String action ,
                                @Field("balUserID") String balUserID
    );

    @FormUrlEncoded
    @POST("ChangePassword")
    Call<JsonObject> changePassword(@Header("Authorization") String auth,
                                    @Field("userID") String userID,
                                    @Field("tokenKey") String tokenKey,
                                    @Field("deviceInfo") String deviceInfo,
                                    @Field("oldPassword") String oldPassword,
                                    @Field("newPassword") String newPassword);


    @FormUrlEncoded
    @POST("ForgetPassword")
    Call<JsonObject> forgetPassword(@Header("Authorization") String auth,
                                    @Field("userName") String userName,
                                    @Field("mobileNo") String mobileNo);

    @FormUrlEncoded
    @POST("GetDashboardBanners")
    Call<JsonObject> getBanner(@Header("Authorization") String auth,
                               @Field("userID") String userID,
                               @Field("tokenKey") String tokenKey,
                               @Field("deviceInfo") String deviceInfo
    );

    @FormUrlEncoded
    @POST("GetNewsMaster")
    Call<JsonObject> getNews(@Header("Authorization") String auth,
                             @Field("userID") String userID,
                             @Field("tokenKey") String tokenKey,
                             @Field("deviceInfo") String deviceInfo,
                             @Field("userType") String userType);

    @FormUrlEncoded
    @POST("CheckServiceAssignStatus")
    Call<JsonObject> checkServiceStatus(@Header("Authorization") String auth,
                                        @Field("userID") String userID,
                                        @Field("tokenKey") String tokenKey,
                                        @Field("deviceInfo") String deviceInfo,
                                        @Field("permissionId") String permissionId);

    @FormUrlEncoded
    @POST("AddUsers")
    Call<JsonObject> addUser(@Header("Authorization") String Auth,
                             @Field("userID") String userID,
                             @Field("tokenKey") String tokenKey,
                             @Field("deviceInfo") String deviceInfo,
                             @Field("mobileNo") String mobileNo,
                             @Field("password") String password,
                             @Field("name") String name,
                             @Field("userType") String userType,
                             @Field("emailID") String emailID,
                             @Field("dob") String dob,
                             @Field("companyName") String companyName,
                             @Field("address") String address,
                             @Field("stateID") String stateID,
                             @Field("cityID") String cityID,
                             @Field("pancardNo") String pancardNo,
                             @Field("aadharNo") String aadharNo,
                             @Field("schemeID") String schemeID,
                             @Field("capBal") String capBal);

    @FormUrlEncoded
    @POST("GetStateList")
    Call<JsonObject> getState(@Header("Authorization") String Auth,
                              @Field("userID") String userID,
                              @Field("tokenKey") String tokenKey,
                              @Field("deviceInfo") String deviceInfo);

    @FormUrlEncoded
    @POST("GetCityList")
    Call<JsonObject> getCity(@Header("Authorization") String Auth,
                             @Field("userID") String userID,
                             @Field("tokenKey") String tokenKey,
                             @Field("deviceInfo") String deviceInfo,
                             @Field("stateID") String stateID);


    @FormUrlEncoded
    @POST("GetSchemeList")
    Call<JsonObject> getScheme(@Header("Authorization") String Auth,
                               @Field("userID") String userID,
                               @Field("tokenKey") String tokenKey,
                               @Field("deviceInfo") String deviceInfo,
                               @Field("action") String action,
                               @Field("userType") String userType,
                               @Field("iD") String iD);

    @FormUrlEncoded
    @POST("GetChieldList")
    Call<JsonObject> getUsers(@Header("Authorization") String auth,
                              @Field("tokenKey") String tokenKey,
                              @Field("deviceInfo") String deviceInfo,
                              @Field("userID") String userid,
                              @Field("action") String action);

    @FormUrlEncoded
    @POST("DebitAmount")
    Call<JsonObject> doDebitBalance(@Header("Authorization") String auth,
                                    @Field("userID") String userID,
                                    @Field("tokenKey") String tokenKey,
                                    @Field("deviceInfo") String deviceInfo,
                                    @Field("amount") String amount,
                                    @Field("chieldID") String chieldID);

    @FormUrlEncoded
    @POST("CreditAmount")
    Call<JsonObject> doCreditBalance(@Header("Authorization") String auth,
                                     @Field("userID") String userID,
                                     @Field("tokenKey") String tokenKey,
                                     @Field("deviceInfo") String deviceInfo,
                                     @Field("amount") String amount,
                                     @Field("chieldID") String chieldID);

    @FormUrlEncoded
    @POST("CreditReport")
    Call<JsonObject> getCreditReport(@Header("Authorization") String auth,
                                     @Field("userID") String userID,
                                     @Field("tokenKey") String tokenKey,
                                     @Field("deviceInfo") String deviceInfo,
                                     @Field("searchBy") String searchBy,
                                     @Field("fromDate") String fromDate,
                                     @Field("toDate") String toDate);

    @FormUrlEncoded
    @POST("DebitReport")
    Call<JsonObject> getDebitReport(@Header("Authorization") String auth,
                                    @Field("userID") String userID,
                                    @Field("tokenKey") String tokenKey,
                                    @Field("deviceInfo") String deviceInfo,
                                    @Field("searchBy") String searchBy,
                                    @Field("fromDate") String fromDate,
                                    @Field("toDate") String toDate);

    @FormUrlEncoded
    @POST("MainLedger")
    Call<JsonObject> getLedgerReport(@Header("Authorization") String auth,
                                     @Field("userID") String userID,
                                     @Field("tokenKey") String tokenKey,
                                     @Field("deviceInfo") String deviceInfo,
                                     @Field("Accountno") String Accountno,
                                     @Field("fromDate") String fromDate,
                                     @Field("toDate") String toDate
    );

    @FormUrlEncoded
    @POST("UserAepsLedgerReport")
    Call<JsonObject> getAepsLedgerReport(@Header("Authorization") String auth,
                                         @Field("userID") String userID,
                                         @Field("tokenKey") String tokenKey,
                                         @Field("deviceInfo") String deviceInfo,
                                         @Field("Accountno") String Accountno,
                                         @Field("fromDate") String fromDate,
                                         @Field("toDate") String toDate);

    @Multipart
    @POST("FileUploading/UploadFile")
    Call<JsonObject> uploadfile(@Header("Authorization") String auth,
                                @Part MultipartBody.Part file);

    @FormUrlEncoded
    @POST("FundRequest")
    Call<JsonObject> doPaymentRequest(@Header("Authorization") String auth,
                                      @Field("userID") String userID,
                                      @Field("tokenKey") String tokenKey,
                                      @Field("deviceInfo") String deviceInfo,
                                      @Field("requestDate") String requestDate,
                                      @Field("referenceNo") String referenceNo,
                                      @Field("bankName") String bankName,
                                      @Field("paymentMode") String paymentMode,
                                      @Field("remark") String remark,
                                      @Field("imagePath") String imagePath,
                                      @Field("requestTo") String requestTo,
                                      @Field("amount") String amount);

    @FormUrlEncoded
    @POST("GetBankDetails")
    Call<JsonObject> getBankList(@Header("Authorization") String auth,
                                 @Field("userID") String userID,
                                 @Field("tokenKey") String tokenKey,
                                 @Field("deviceInfo") String deviceInfo);

    @FormUrlEncoded
    @POST("RechargeReport")
    Call<JsonObject> getReport(
            @Header("Authorization") String auth,
            @Field("userID") String userID,
            @Field("tokenKey") String tokenKey,
            @Field("deviceInfo") String deviceInfo,
            @Field("userType") String userType,
            @Field("amountWise") String amountWise,
            @Field("statusWise") String statusWise,
            @Field("modeWise") String modeWise,
            @Field("mobileNo") String mobileNo,
            @Field("fromDate") String fromDate,
            @Field("toDate") String toDate,
            @Field("parentWise") String parentWise,
            @Field("operatorWise") String operatorWise,
            @Field("ServiceId") String ServiceId);

    @FormUrlEncoded
    @POST("DoDTHRecharge")
    Call<JsonObject> doDthRecharge(
            @Header("Authorization") String auth,
            @Field("userID") String userID,
            @Field("tokenKey") String tokenKey,
            @Field("deviceInfo") String deviceInfo,
            @Field("OperatorId") String OperatorId,
            @Field("Amount") String Amount,
            @Field("MobileNo") String MobileNo,
            @Field("ServiceType") String ServiceType);

    @FormUrlEncoded
    @POST("DoRecharge")
    Call<JsonObject> doRecharge(
            @Header("Authorization") String auth,
            @Field("userID") String userID,
            @Field("tokenKey") String tokenKey,
            @Field("deviceInfo") String deviceInfo,
            @Field("OperatorId") String OperatorId,
            @Field("Amount") String Amount,
            @Field("MobileNo") String MobileNo,
            @Field("ServiceType") String ServiceType);

    @FormUrlEncoded
    @POST("MplanDTHMnpCheck")
    Call<JsonObject> getDthOperator(@Header("Authorization") String auth,
                                    @Field("userID") String userID,
                                    @Field("tokenKey") String tokenKey,
                                    @Field("deviceInfo") String deviceInfo,
                                    @Field("mobileNumber") String mobileNumber);





    @FormUrlEncoded
    @POST("MplanGetCustomerInfo")
    Call<JsonObject> getDthUserInfo(@Field("userID") String userID,
                                    @Field("tokenKey") String tokenKey,
                                    @Field("deviceInfo") String deviceInfo,
                                    @Field("operatorName") String operatorName,
                                    @Field("dthNo") String dthNo);



    @FormUrlEncoded
    @POST("MPlanGetMnp")
    Call<JsonObject> getOperatorCircle(@Header("Authorization") String auth,
                                       @Field("userID") String userID,
                                       @Field("tokenKey") String tokenKey,
                                       @Field("deviceInfo") String deviceInfo,
                                       @Field("mobileNumber") String mobileNumber
    );


    @FormUrlEncoded
    @POST("GetOperatorsList")
    Call<JsonObject> getOperators(@Header("Authorization") String auth,
                                  @Field("tokenKey") String tokenKey,
                                  @Field("deviceInfo") String deviceInfo,
                                  @Field("userID") String userID,
                                  @Field("serviceID") String serviceID);

    @FormUrlEncoded
    @POST("GetService")
    Call<JsonObject> getServices(
            @Header("Authorization") String auth,
            @Field("tokenKey") String tokenKey,
            @Field("deviceInfo") String deviceInfo,
            @Field("userID") String userID);

    @FormUrlEncoded
    @POST("DoComplain")
    Call<JsonObject> makeComplaint(@Header("Authorization") String auth,
                                   @Field("userID") String userID,
                                   @Field("tokenKey") String tokenKey,
                                   @Field("deviceInfo") String deviceInfo,
                                   @Field("UniqueId") String UniqueId,
                                   @Field("remarks") String remarks,
                                   @Field("ComplainType") String ComplainType,
                                   @Field("LiveId") String LiveId,
                                   @Field("serviceName") String serviceName,
                                   @Field("TxnDate") String TxnDate
    );

    @FormUrlEncoded
    @POST("GetSender")
    Call<JsonObject> isUserValidate(@Header("Authorization") String auth,
                                    @Field("tokenKey") String tokenKey,
                                    @Field("deviceInfo") String deviceInfo,
                                    @Field("userID") String userid,
                                    @Field("senderMobileNo") String SenderMobsenderMobileNoile);


    @FormUrlEncoded
    @POST("DMTaccountVarify")
    Call<JsonObject> verifyAccount(@Header("Authorization") String auth,
                                   @Field("userID") String userID,
                                   @Field("tokenKey") String tokenKey,
                                   @Field("deviceInfo") String deviceInfo,
                                   @Field("remitterId") String remitterId,
                                   @Field("bankName") String bankName,
                                   @Field("beneFirstName") String beneFirstName,
                                   @Field("beneLastName") String beneLastName,
                                   @Field("mobileNo") String mobileNo,
                                   @Field("ifscCode") String ifscCode,
                                   @Field("accountNo") String accountNo,
                                   @Field("senderMobileNo") String senderMobileNo,
                                   @Field("address") String address,
                                   @Field("pinCode") String pinCode,
                                   @Field("otp") String otp,
                                   @Field("senderName") String senderName,
                                   @Field("transactionMode") String transactionMode);

    @FormUrlEncoded
    @POST("BeneRegistration")
    Call<JsonObject> addBeneficiary(@Header("Authorization") String auth,
                                    @Field("userID") String userID,
                                    @Field("tokenKey") String tokenKey,
                                    @Field("deviceInfo") String deviceInfo,
                                    @Field("remitterId") String remitterId,
                                    @Field("bankName") String bankName,
                                    @Field("beneFirstName") String beneFirstName,
                                    @Field("beneLastName") String beneLastName,
                                    @Field("mobileNo") String mobileNo,
                                    @Field("ifscCode") String ifscCode,
                                    @Field("accountNo") String accountNo,
                                    @Field("senderMobileNo") String senderMobileNo,
                                    @Field("address") String address,
                                    @Field("pinCode") String pinCode,
                                    @Field("otp") String otp);

    @FormUrlEncoded
    @POST("GetBankListForDMT")
    Call<JsonObject> getBankDmt(@Header("Authorization") String auth,
                                @Field("tokenKey") String tokenKey,
                                @Field("deviceInfo") String deviceInfo,
                                @Field("userID") String userID);

    @FormUrlEncoded
    @POST("VerifyUPIDMT")
    Call<JsonObject> verifyUpiId(@Header("Authorization") String auth,
                                 @Field("userID") String userID,
                                 @Field("tokenKey") String tokenKey,
                                 @Field("deviceInfo") String deviceInfo,
                                 @Field("remitterId") String remitterId,
                                 @Field("beneName") String beneName,
                                 @Field("mobile") String mobile,
                                 @Field("upiId") String upiId,
                                 @Field("senderMobileNo") String senderMobileNo,
                                 @Field("senderName") String senderName);


    @FormUrlEncoded
    @POST("AddUPIforDMT")
    Call<JsonObject> addDmtUpi(@Header("Authorization") String auth,
                               @Field("userID") String userID,
                               @Field("tokenKey") String tokenKey,
                               @Field("deviceInfo") String deviceInfo,
                               @Field("remitterId") String remitterId,
                               @Field("beneFirsName") String beneFirsName,
                               @Field("mobileNo") String mobileNo,
                               @Field("ifscCode") String ifscCode,
                               @Field("upiId") String upiId);


    @FormUrlEncoded
    @POST("DeleteBeneficiary")
    Call<JsonObject> deleteBeneficiary(@Header("Authorization") String auth,
                                       @Field("tokenKey") String tokenKey,
                                       @Field("deviceInfo") String deviceInfo,
                                       @Field("userID") String userID,
                                       @Field("beneficiaryId") String beneficiaryId,
                                       @Field("senderMobileNo") String senderMobileNo,
                                       @Field("remitterId") String remitterId);


    @FormUrlEncoded
    @POST("transferMoneyUPI")
    Call<JsonObject> payUpi(@Header("Authorization") String auth,
                            @Field("userID") String userID,
                            @Field("tokenKey") String tokenKey,
                            @Field("deviceInfo") String deviceInfo,
                            @Field("txnAmount") String txnAmount,
                            @Field("beneficiaryId") String beneficiaryId,
                            @Field("senderName") String senderName,
                            @Field("senderMobileNo") String senderMobileNo,
                            @Field("accountNo") String accountNo,
                            @Field("beneficiaryName") String beneficiaryName,
                            @Field("beneMobileNo") String beneMobileNo,
                            @Field("transactionMode") String transactionMode,
                            @Field("latitude") String latitude,
                            @Field("longitude") String longitude
    );

    @FormUrlEncoded
    @POST("TransferMoney")
    Call<JsonObject> payBeneficiary(@Header("Authorization") String auth,
                                    @Field("userID") String userID,
                                    @Field("tokenKey") String tokenKey,
                                    @Field("deviceInfo") String deviceInfo,
                                    @Field("txnAmount") String txnAmount,
                                    @Field("beneficiaryId") String beneficiaryId,
                                    @Field("outletId") String outletId,
                                    @Field("senderName") String senderName,
                                    @Field("senderMobileNo") String senderMobileNo,
                                    @Field("accountNo") String accountNo,
                                    @Field("beneficiaryName") String beneficiaryName,
                                    @Field("bankName") String bankName,
                                    @Field("ifscCode") String ifscCode,
                                    @Field("beneMobileNo") String beneMobileNo,
                                    @Field("transactionMode") String transactionMode,
                                    @Field("bankId") String bankId
    );

    @FormUrlEncoded
    @POST("GetSecurityMpin")
    Call<JsonObject> checkMpinOrTPIN(@Header("Authorization") String auth,
                                     @Field("userID") String userID,
                                     @Field("tokenKey") String tokenKey,
                                     @Field("deviceInfo") String deviceInfo,
                                     @Field("securityType") String securityType,
                                     @Field("securityPin") String securityPin);

    @FormUrlEncoded
    @POST("SenderOtpVarify")
    Call<JsonObject> verifySender(@Header("Authorization") String auth,
                                  @Field("tokenKey") String token,
                                  @Field("deviceInfo") String DeviceInfo,
                                  @Field("remitterId") String remitterId,
                                  @Field("userID") String userID,
                                  @Field("senderMobileNo") String senderMobileNo,
                                  @Field("otp") String otp);


    @FormUrlEncoded
    @POST("AddSender")
    Call<JsonObject> addSender(@Header("Authorization") String auth,
                               @Field("tokenKey") String token,
                               @Field("deviceInfo") String DeviceInfo,
                               @Field("userID") String userID,
                               @Field("senderMobileNo") String sendermobileno,
                               @Field("firstName") String firstname,
                               @Field("lastName") String lastname,
                               @Field("pinCode") String pincode,
                               @Field("address") String address,
                               @Field("otp") String otp);

    @FormUrlEncoded
    @POST("UserMoneyTransferReport")
    Call<JsonObject> getDmtReport(@Header("Authorization") String auth,
                                  @Field("userID") String userID,
                                  @Field("tokenKey") String tokenKey,
                                  @Field("deviceInfo") String deviceInfo,
                                  @Field("fromDate") String fromDate,
                                  @Field("toDate") String toDate,
                                  @Field("Accountno") String Accountno);

    @FormUrlEncoded
    @POST("GetUserAepsBalance")
    Call<JsonObject> getAepsBalance(
            @Header("Authorization") String auth,
            @Field("userID") String userID,
            @Field("tokenKey") String tokenKey,
            @Field("deviceInfo") String deviceInfo,
            @Field("action") String action,
            @Field("balUserID") String balUserID);


    @FormUrlEncoded
    @POST("UPIGateway")
    Call<JsonObject> upiGateway(@Header("Authorization") String auth,
                                @Field("userID") String userID,
                                @Field("tokenKey") String tokenKey,
                                @Field("deviceInfo") String deviceInfo,
                                @Field("amount") String amount,
                                @Field("customerName") String customerName,
                                @Field("customerEmail") String customerEmail,
                                @Field("customerMobile") String customerMobile);

    @FormUrlEncoded
    @POST("UserUpiGateWay")
    Call<JsonObject> getAddMoneyReport(@Header("Authorization") String auth,
                                       @Field("userID") String userID,
                                       @Field("tokenKey") String tokenKey,
                                       @Field("deviceInfo") String deviceInfo,
                                       @Field("fromDate") String amountWise,
                                       @Field("toDate") String statusWise

    );


    @FormUrlEncoded
    @POST("GetUserAepsReport")
    Call<JsonObject> getAepsReport(@Header("Authorization") String auth,
                                   @Field("userID") String userID,
                                   @Field("tokenKey") String tokenKey,
                                   @Field("deviceInfo") String deviceInfo,
                                   @Field("fromDate") String fromDate,
                                   @Field("toDate") String toDate);

    @FormUrlEncoded
    @POST("BbpsBillPay")
    Call<JsonObject> payBill(@Header("Authorization") String auth,
                             @Field("userID") String userID,
                             @Field("tokenKey") String tokenKey,
                             @Field("deviceInfo") String deviceInfo,
                             @Field("ServiceType") String ServiceType,
                             @Field("operatorId") String operatorId,
                             @Field("consumerNumber") String consumerNumber,
                             @Field("mobileNo") String mobileNo,
                             @Field("consumerName") String consumerName,
                             @Field("billAmt") String billAmt,
                             @Field("dueDate") String dueDate,
                             @Field("serviceId") String serviceId,
                             @Field("billerinfo") String billerinfo,
                             @Field("inputinfo") String inputinfo,
                             @Field("requestId") String requestId);

    @FormUrlEncoded
    @POST("BbpsBillFetch")
    Call<JsonObject> fetchBill(@Header("Authorization") String auth,
                               @Field("userID") String userID,
                               @Field("tokenKey") String tokenKey,
                               @Field("deviceInfo") String deviceInfo,
                               @Field("ServiceType") String ServiceType,
                               @Field("serviceId") String serviceId,
                               @Field("operatorId") String operatorId,
                               @Field("consumerNumber") String consumerNumber,
                               @Field("mobileNo") String mobileNo,
                               @Field("subDivisionCode") String subDivisionCode);

    @FormUrlEncoded
    @POST("UserUtilityReport")
    Call<JsonObject> getBBPSReport(@Header("Authorization") String auth,
                                   @Field("userID") String userID,
                                   @Field("tokenKey") String tokenKey,
                                   @Field("deviceInfo") String deviceInfo,
                                   @Field("fromDate") String fromDate,
                                   @Field("toDate") String toDate,
                                   @Field("ServiceName") String ServiceName);

    @FormUrlEncoded
    @POST("SettlementBankMaster")
    Call<JsonObject> getAccountDetails(@Header("Authorization") String auth,
                                       @Field("userID") String userID,
                                       @Field("tokenKey") String tokenKey,
                                       @Field("deviceInfo") String deviceInfo);

    @FormUrlEncoded
    @POST("WPayouts")
    Call<JsonObject> moveToBank(@Header("Authorization") String auth,
                                @Field("userID") String userID,
                                @Field("tokenKey") String tokenKey,
                                @Field("deviceInfo") String deviceInfo,
                                @Field("WalletType") String WalletType,
                                @Field("Amount") String Amount,
                                @Field("AccountNo") String AccountNo,
                                @Field("ifscCode") String ifscCode,
                                @Field("AccountType") String AccountType,
                                @Field("TransactionType") String TransactionType,
                                @Field("AcHolderName") String AcHolderName,
                                @Field("apiname") String apiname);


    @FormUrlEncoded
    @POST("Add-Payoutbank")
    Call<JsonObject> addbankDetails(@Header("Authorization") String auth,
                                    @Field("userID") String userID,
                                    @Field("tokenKey") String tokenKey,
                                    @Field("deviceInfo") String deviceInfo,
                                    @Field("BankName") String BankName,
                                    @Field("AccountNo") String AccountNo,
                                    @Field("AccHolderName") String AccHolderName,
                                    @Field("IfscCode") String IfscCode);

    @FormUrlEncoded
    @POST("UserSettlementReport")
    Call<JsonObject> getSettlementReport(@Header("Authorization") String auth,
                                         @Field("userID") String userID,
                                         @Field("tokenKey") String tokenKey,
                                         @Field("deviceInfo") String deviceInfo,
                                         @Field("fromDate") String fromDate,
                                         @Field("toDate") String toDate,
                                         @Field("Accountno") String Accountno);


    @FormUrlEncoded
    @POST("myCommission")
    Call<JsonObject> getMyCommission(@Header("Authorization") String auth,
                                     @Field("userID") String userID,
                                     @Field("tokenKey") String tokenKey,
                                     @Field("deviceInfo") String deviceInfo);

    @FormUrlEncoded
    @POST("UserSignUp2")
    Call<JsonObject> newUserSignUp(@Header("Authorization") String auth,
                                   @Field("name") String name,
                                   @Field("dob") String dob,
                                   @Field("shopName") String shopName,
                                   @Field("mobileNo") String mobileno,
                                   @Field("emailId") String emailid,
                                   @Field("address") String address,
                                   @Field("pincode") String pincode,
                                   @Field("stateId") String stateId,
                                   @Field("cityId") String cityId,
                                   @Field("remark") String remark,
                                   @Field("appversion") String appversion,
                                   @Field("password") String password
    );

    ////////////uti pan card //////////////////

    @FormUrlEncoded
    @POST("CheckUsersPSA")
    Call<JsonObject> utiPancardStatus(@Header("Authorization") String auth,
                                      @Field("userID") String userID,
                                      @Field("deviceInfo") String deviceInfo,
                                      @Field("tokenKey") String tokenKey
    );


    @FormUrlEncoded
    @POST("CreatePSA")
    Call<JsonObject> createUtiPancard(@Header("Authorization") String auth,
                                      @Field("userID") String userID,
                                      @Field("deviceInfo") String deviceInfo,
                                      @Field("tokenKey") String tokenKey,
                                      @Field("VleName") String VleName,
                                      @Field("VleMobileNo") String VleMobileNo,
                                      @Field("VleEmailId") String VleEmailId,
                                      @Field("VleShop") String VleShop,
                                      @Field("VleLocation") String VleLocation,
                                      @Field("PinCode") String PinCode,
                                      @Field("Panno") String Panno,
                                      @Field("AadharNo") String AadharNo,
                                      @Field("StateId") String StateId
    );

    @FormUrlEncoded
    @POST("PurchaseCouponForUTI")
    Call<JsonObject> purchaseUtiPancardCoupon(@Header("Authorization") String auth,
                                              @Field("userID") String userID,
                                              @Field("deviceInfo") String deviceInfo,
                                              @Field("tokenKey") String tokenKey,
                                              @Field("VleId") String VleId,
                                              @Field("VleName") String VleName,
                                              @Field("CouponType") String CouponType,
                                              @Field("Quantity") String Quantity,
                                              @Field("TxnAmt") String TxnAmt
    );


    @FormUrlEncoded
    @POST("SelectCouponType")
    Call<JsonObject> getFees(@Header("Authorization") String auth,
                             @Field("userID") String userID,
                             @Field("deviceInfo") String deviceInfo,
                             @Field("tokenKey") String tokenKey,
                             @Field("OperatorId") String OperatorId,
                             @Field("Quantity") String Quantity
    );

    @POST("GetStateListForUTI")
    Call<JsonObject> getStateForUtiPancard(@Header("Authorization") String Auth
    );
///////////////////////////////////////////////////////////////////////////////////////

    @FormUrlEncoded
    @POST("GetSaleReport")
    Call<JsonObject> getSalesReport(@Header("Authorization") String auth,
                                    @Field("userID") String userID,
                                    @Field("tokenKey") String tokenKey,
                                    @Field("deviceInfo") String deviceInfo
    );

    @FormUrlEncoded
    @POST("SalesReport")
    Call<JsonObject> getCommissionReport(@Header("Authorization") String auth,
                                         @Field("userID") String userID,
                                         @Field("tokenKey") String tokenKey,
                                         @Field("deviceInfo") String deviceInfo,
                                         @Field("SearchMode") String SearchMode,
                                         @Field("fromDate") String fromDate,
                                         @Field("toDate") String toDate);

    @FormUrlEncoded
    @POST("UserOfflinePaymentReport")
    Call<JsonObject> myFundRequestReport(@Header("Authorization") String auth,
                                         @Field("userID") String userID,
                                         @Field("tokenKey") String tokenKey,
                                         @Field("deviceInfo") String deviceInfo,
                                         @Field("userType") String userType,
                                         @Field("fromDate") String fromDate,
                                         @Field("toDate") String toDate);

    @POST("GetUPIID")
    Call<JsonObject> getUpiId(@Header("Authorization") String Auth);

    @FormUrlEncoded
    @POST("WTSUPIGateWay")
    Call<JsonObject> insertUPI_info(@Header("Authorization") String auth,
                                    @Field("userID") String userID,
                                    @Field("Name") String Name,
                                    @Field("tokenKey") String tokenKey,
                                    @Field("deviceInfo") String deviceInfo,
                                    @Field("amount") String amount,
                                    @Field("upiName") String upiName
    );


    @FormUrlEncoded
    @POST("UpdateWTSUpiGatewayStatus")
    Call<JsonObject> updateUPI_info(@Header("Authorization") String auth,
                                    @Field("userID") String userID,
                                    @Field("UniqueTransactionId") String UniqueTransactionId,
                                    @Field("tokenKey") String tokenKey,
                                    @Field("deviceInfo") String deviceInfo,
                                    @Field("TransactionId") String TransactionId,
                                    @Field("Status") String Status);

    @POST("getQRImage")
    Call<JsonObject> getQRImage(@Header("Authorization") String auth);

    @FormUrlEncoded
    @POST("GetMplanCircle")
    Call<JsonObject> getCircle(@Header("Authorization") String auth,
                               @Field("userID") String userID,
                               @Field("tokenKey") String tokenKey,
                               @Field("deviceInfo") String deviceInfo

    );



    @FormUrlEncoded
    @POST("MplanMobileSpecialPlan")
    Call<JsonObject> getMyPlans(@Field("userID") String userID,
                                @Field("tokenKey") String tokenKey,
                                @Field("deviceInfo") String deviceInfo,
                                @Field("operatorName") String operatorName,
                                @Field("mobileNumber") String mobileNumber);



    @FormUrlEncoded
    @POST("MplanMobileSimplePlan")
    Call<JsonObject> getPlans(@Field("userID") String userID,
                              @Field("tokenKey") String tokenKey,
                              @Field("deviceInfo") String deviceInfo,
                              @Field("operatorName") String operatorName,
                              @Field("circle") String circle);



    @FormUrlEncoded
    @POST("MplanGetDthPlan")
    Call<JsonObject> getDthMplan(@Field("userID") String userID,
                                 @Field("tokenKey") String tokenKey,
                                 @Field("deviceInfo") String deviceInfo,
                                 @Field("operatorName") String operatorName);


    @FormUrlEncoded
    @POST("DownLineRechargeReport")
    Call<JsonObject> getDownLineReport(@Header("Authorization") String auth,
                                       @Field("userID") String userID,
                                       @Field("tokenKey") String tokenKey,
                                       @Field("deviceInfo") String deviceInfo,
                                       @Field("userType") String userType,
                                       @Field("fromDate") String fromDate,
                                       @Field("toDate") String toDate);


    @FormUrlEncoded
    @POST("ComplaintStatusReport")
    Call<JsonObject> makeComplaintReport(@Header("Authorization") String auth,
                                         @Field("userID") String userID,
                                         @Field("tokenKey") String tokenKey,
                                         @Field("deviceInfo") String deviceInfo,
                                         @Field("fromDate") String fromDate,
                                         @Field("toDate") String toDate);

    @FormUrlEncoded
    @POST("UPIGatewayReport")  //  for add money qrcode collection
    Call<JsonObject> upigatewayreport(@Header("Authorization") String auth,
                                      @Field("userID") String userID,
                                      @Field("tokenKey") String tokenKey,
                                      @Field("deviceInfo") String deviceInfo,
                                      @Field("fromDate") String amountWise,
                                      @Field("toDate") String statusWise,
                                      @Field("searchBy") String searchBy

    );

    @FormUrlEncoded
    @POST("UserCreditDebitReport")
    Call<JsonObject> getCreditDebitReport(@Header("Authorization") String auth,
                                          @Field("userID") String userID,
                                          @Field("tokenKey") String tokenKey,
                                          @Field("deviceInfo") String deviceInfo,
                                          @Field("crOrDrType") String crOrDrType,
                                          @Field("fromDate") String fromDate,
                                          @Field("toDate") String toDate);









}
