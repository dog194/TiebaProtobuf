package tbclient.GetWebviewCacheInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_WEBVIEW_VERSION = "";

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 1)
    public final CommonReq f1468common;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String webview_version;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1469common;
        public String webview_version;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f1469common = dataReq.f1468common;
            this.webview_version = dataReq.webview_version;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1468common = builder.f1469common;
            String str = builder.webview_version;
            if (str == null) {
                this.webview_version = "";
                return;
            } else {
                this.webview_version = str;
                return;
            }
        }
        this.f1468common = builder.f1469common;
        this.webview_version = builder.webview_version;
    }
}