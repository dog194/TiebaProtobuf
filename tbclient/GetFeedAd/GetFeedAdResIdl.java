package tbclient.GetFeedAd;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetFeedAdResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetFeedAdResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetFeedAdResIdl getFeedAdResIdl) {
            super(getFeedAdResIdl);
            if (getFeedAdResIdl == null) {
                return;
            }
            this.error = getFeedAdResIdl.error;
            this.data = getFeedAdResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetFeedAdResIdl build(boolean z) {
            return new GetFeedAdResIdl(this, z);
        }
    }

    public GetFeedAdResIdl(Builder builder, boolean z) {
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