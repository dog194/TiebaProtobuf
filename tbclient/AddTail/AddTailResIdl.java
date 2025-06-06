package tbclient.AddTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class AddTailResIdl extends Message {

    @ProtoField(tag = 1)
    public final ResData data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<AddTailResIdl> {
        public ResData data;
        public Error error;

        public Builder() {
        }

        public Builder(AddTailResIdl addTailResIdl) {
            super(addTailResIdl);
            if (addTailResIdl == null) {
                return;
            }
            this.data = addTailResIdl.data;
            this.error = addTailResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public AddTailResIdl build(boolean z) {
            return new AddTailResIdl(this, z);
        }
    }

    public AddTailResIdl(Builder builder, boolean z) {
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