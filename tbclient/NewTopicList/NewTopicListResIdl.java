package tbclient.NewTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class NewTopicListResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<NewTopicListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(NewTopicListResIdl newTopicListResIdl) {
            super(newTopicListResIdl);
            if (newTopicListResIdl == null) {
                return;
            }
            this.error = newTopicListResIdl.error;
            this.data = newTopicListResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public NewTopicListResIdl build(boolean z) {
            return new NewTopicListResIdl(this, z);
        }
    }

    public NewTopicListResIdl(Builder builder, boolean z) {
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