package tbclient.UrlParser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class UrlParserResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<UrlParserResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(UrlParserResIdl urlParserResIdl) {
            super(urlParserResIdl);
            if (urlParserResIdl == null) {
                return;
            }
            this.error = urlParserResIdl.error;
            this.data = urlParserResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public UrlParserResIdl build(boolean z) {
            return new UrlParserResIdl(this, z);
        }
    }

    public UrlParserResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
        } else {
            this.error = builder.error;
            this.data = builder.data;
        }
    }
}