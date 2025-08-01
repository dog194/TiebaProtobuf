package tbclient.UrlParser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class UrlParserReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<UrlParserReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(UrlParserReqIdl urlParserReqIdl) {
            super(urlParserReqIdl);
            if (urlParserReqIdl == null) {
                return;
            }
            this.data = urlParserReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public UrlParserReqIdl build(boolean z) {
            return new UrlParserReqIdl(this, z);
        }
    }

    public UrlParserReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}