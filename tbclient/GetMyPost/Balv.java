package tbclient.GetMyPost;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class Balv extends Message {

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer days_tofree;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer is_black;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer is_block;
    public static final Integer DEFAULT_IS_BLACK = 0;
    public static final Integer DEFAULT_IS_BLOCK = 0;
    public static final Integer DEFAULT_DAYS_TOFREE = 0;

    public static final class Builder extends Message.Builder<Balv> {
        public Integer days_tofree;
        public Integer is_black;
        public Integer is_block;

        public Builder() {
        }

        public Builder(Balv balv) {
            super(balv);
            if (balv == null) {
                return;
            }
            this.is_black = balv.is_black;
            this.is_block = balv.is_block;
            this.days_tofree = balv.days_tofree;
        }

        @Override // com.squareup.wire.Message.Builder
        public Balv build(boolean z) {
            return new Balv(this, z);
        }
    }

    public Balv(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_black;
            if (num == null) {
                this.is_black = DEFAULT_IS_BLACK;
            } else {
                this.is_black = num;
            }
            Integer num2 = builder.is_block;
            if (num2 == null) {
                this.is_block = DEFAULT_IS_BLOCK;
            } else {
                this.is_block = num2;
            }
            Integer num3 = builder.days_tofree;
            if (num3 == null) {
                this.days_tofree = DEFAULT_DAYS_TOFREE;
                return;
            } else {
                this.days_tofree = num3;
                return;
            }
        }
        this.is_black = builder.is_black;
        this.is_block = builder.is_block;
        this.days_tofree = builder.days_tofree;
    }
}