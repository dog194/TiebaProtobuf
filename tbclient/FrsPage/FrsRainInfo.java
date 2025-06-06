package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FrsRainInfo extends Message {
    public static final String DEFAULT_BUSINESS_ID = "";
    public static final String DEFAULT_POPUP_INFO_STR = "";
    public static final String DEFAULT_POPUP_URL = "";
    public static final String DEFAULT_REPORT_INFO = "";
    public static final String DEFAULT_RESOURCE = "";

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String business_id;

    @ProtoField(tag = 3)
    public final FrsRanPopupInfo popup_info;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String popup_info_str;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String popup_url;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String report_info;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String resource;

    public static final class Builder extends Message.Builder<FrsRainInfo> {
        public String business_id;
        public FrsRanPopupInfo popup_info;
        public String popup_info_str;
        public String popup_url;
        public String report_info;
        public String resource;

        public Builder() {
        }

        public Builder(FrsRainInfo frsRainInfo) {
            super(frsRainInfo);
            if (frsRainInfo == null) {
                return;
            }
            this.resource = frsRainInfo.resource;
            this.popup_url = frsRainInfo.popup_url;
            this.popup_info = frsRainInfo.popup_info;
            this.business_id = frsRainInfo.business_id;
            this.report_info = frsRainInfo.report_info;
            this.popup_info_str = frsRainInfo.popup_info_str;
        }

        @Override // com.squareup.wire.Message.Builder
        public FrsRainInfo build(boolean z) {
            return new FrsRainInfo(this, z);
        }
    }

    public FrsRainInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.resource;
            if (str == null) {
                this.resource = "";
            } else {
                this.resource = str;
            }
            String str2 = builder.popup_url;
            if (str2 == null) {
                this.popup_url = "";
            } else {
                this.popup_url = str2;
            }
            this.popup_info = builder.popup_info;
            String str3 = builder.business_id;
            if (str3 == null) {
                this.business_id = "";
            } else {
                this.business_id = str3;
            }
            String str4 = builder.report_info;
            if (str4 == null) {
                this.report_info = "";
            } else {
                this.report_info = str4;
            }
            String str5 = builder.popup_info_str;
            if (str5 == null) {
                this.popup_info_str = "";
                return;
            } else {
                this.popup_info_str = str5;
                return;
            }
        }
        this.resource = builder.resource;
        this.popup_url = builder.popup_url;
        this.popup_info = builder.popup_info;
        this.business_id = builder.business_id;
        this.report_info = builder.report_info;
        this.popup_info_str = builder.popup_info_str;
    }
}