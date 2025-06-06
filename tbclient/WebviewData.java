package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class WebviewData extends Message {
    public static final String DEFAULT_DATA = "";
    public static final String DEFAULT_URL = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String data;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    public static final class Builder extends Message.Builder<WebviewData> {
        public String data;
        public String url;

        public Builder() {
        }

        public Builder(WebviewData webviewData) {
            super(webviewData);
            if (webviewData == null) {
                return;
            }
            this.url = webviewData.url;
            this.data = webviewData.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public WebviewData build(boolean z) {
            return new WebviewData(this, z);
        }
    }

    public WebviewData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.data;
            if (str2 == null) {
                this.data = "";
                return;
            } else {
                this.data = str2;
                return;
            }
        }
        this.url = builder.url;
        this.data = builder.data;
    }
}