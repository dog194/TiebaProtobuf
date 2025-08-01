package tbclient.GetToken;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ToastInfo extends Message {
    public static final String DEFAULT_BTNTEXT = "";
    public static final String DEFAULT_MESSAGE = "";
    public static final String DEFAULT_SHARETOKEN = "";
    public static final String DEFAULT_URL = "";

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String btntext;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String message;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String sharetoken;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    public static final class Builder extends Message.Builder<ToastInfo> {
        public String btntext;
        public String message;
        public String sharetoken;
        public String url;

        public Builder() {
        }

        public Builder(ToastInfo toastInfo) {
            super(toastInfo);
            if (toastInfo == null) {
                return;
            }
            this.url = toastInfo.url;
            this.message = toastInfo.message;
            this.btntext = toastInfo.btntext;
            this.sharetoken = toastInfo.sharetoken;
        }

        @Override // com.squareup.wire.Message.Builder
        public ToastInfo build(boolean z) {
            return new ToastInfo(this, z);
        }
    }

    public ToastInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.message;
            if (str2 == null) {
                this.message = "";
            } else {
                this.message = str2;
            }
            String str3 = builder.btntext;
            if (str3 == null) {
                this.btntext = "";
            } else {
                this.btntext = str3;
            }
            String str4 = builder.sharetoken;
            if (str4 == null) {
                this.sharetoken = "";
                return;
            } else {
                this.sharetoken = str4;
                return;
            }
        }
        this.url = builder.url;
        this.message = builder.message;
        this.btntext = builder.btntext;
        this.sharetoken = builder.sharetoken;
    }
}