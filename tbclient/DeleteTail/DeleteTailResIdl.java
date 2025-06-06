package tbclient.DeleteTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class DeleteTailResIdl extends Message {

    @ProtoField(tag = 1)
    public final ResData data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<DeleteTailResIdl> {
        public ResData data;
        public Error error;

        public Builder() {
        }

        public Builder(DeleteTailResIdl deleteTailResIdl) {
            super(deleteTailResIdl);
            if (deleteTailResIdl == null) {
                return;
            }
            this.data = deleteTailResIdl.data;
            this.error = deleteTailResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public DeleteTailResIdl build(boolean z) {
            return new DeleteTailResIdl(this, z);
        }
    }

    public DeleteTailResIdl(Builder builder, boolean z) {
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