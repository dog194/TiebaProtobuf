package tbclient.GetFeedAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.AppTransmitData;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_AD_CONTEXT_LIST = "";
    public static final String DEFAULT_AD_EXT_PARAMS = "";
    public static final String DEFAULT_AD_PLACE = "";

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ad_context_list;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String ad_ext_params;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ad_place;

    @ProtoField(tag = 2)
    public final AppTransmitData app_transmit_data;

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1386common;

    public static final class Builder extends Message.Builder<DataReq> {
        public String ad_context_list;
        public String ad_ext_params;
        public String ad_place;
        public AppTransmitData app_transmit_data;

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1387common;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1387common = dataReq.f1386common;
            this.app_transmit_data = dataReq.app_transmit_data;
            this.ad_place = dataReq.ad_place;
            this.ad_ext_params = dataReq.ad_ext_params;
            this.ad_context_list = dataReq.ad_context_list;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1386common = builder.f1387common;
            this.app_transmit_data = builder.app_transmit_data;
            String str = builder.ad_place;
            if (str == null) {
                this.ad_place = "";
            } else {
                this.ad_place = str;
            }
            String str2 = builder.ad_ext_params;
            if (str2 == null) {
                this.ad_ext_params = "";
            } else {
                this.ad_ext_params = str2;
            }
            String str3 = builder.ad_context_list;
            if (str3 == null) {
                this.ad_context_list = "";
                return;
            } else {
                this.ad_context_list = str3;
                return;
            }
        }
        this.f1386common = builder.f1387common;
        this.app_transmit_data = builder.app_transmit_data;
        this.ad_place = builder.ad_place;
        this.ad_ext_params = builder.ad_ext_params;
        this.ad_context_list = builder.ad_context_list;
    }
}