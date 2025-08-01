package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class Good extends Message {
    public static final Integer DEFAULT_NUM = 0;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer num;

    public static final class Builder extends Message.Builder<Good> {
        public Integer num;

        public Builder() {
        }

        public Builder(Good good) {
            super(good);
            if (good == null) {
                return;
            }
            this.num = good.num;
        }

        @Override // com.squareup.wire.Message.Builder
        public Good build(boolean z) {
            return new Good(this, z);
        }
    }

    public Good(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.num;
            if (num == null) {
                this.num = DEFAULT_NUM;
                return;
            } else {
                this.num = num;
                return;
            }
        }
        this.num = builder.num;
    }
}