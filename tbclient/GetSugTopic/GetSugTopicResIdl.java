package tbclient.GetSugTopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetSugTopicResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetSugTopicResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetSugTopicResIdl getSugTopicResIdl) {
            super(getSugTopicResIdl);
            if (getSugTopicResIdl == null) {
                return;
            }
            this.error = getSugTopicResIdl.error;
            this.data = getSugTopicResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetSugTopicResIdl build(boolean z) {
            return new GetSugTopicResIdl(this, z);
        }
    }

    public GetSugTopicResIdl(Builder builder, boolean z) {
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