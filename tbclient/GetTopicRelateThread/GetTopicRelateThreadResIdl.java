package tbclient.GetTopicRelateThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetTopicRelateThreadResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<GetTopicRelateThreadResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetTopicRelateThreadResIdl getTopicRelateThreadResIdl) {
            super(getTopicRelateThreadResIdl);
            if (getTopicRelateThreadResIdl == null) {
                return;
            }
            this.data = getTopicRelateThreadResIdl.data;
            this.error = getTopicRelateThreadResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetTopicRelateThreadResIdl build(boolean z) {
            return new GetTopicRelateThreadResIdl(this, z);
        }
    }

    public GetTopicRelateThreadResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
        } else {
            this.data = builder.data;
            this.error = builder.error;
        }
    }
}