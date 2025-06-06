package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class SpriteShowStrategy extends Message {
    public static final Integer DEFAULT_ALTER_SECONDS = 0;
    public static final Integer DEFAULT_ALTER_TIMES = 0;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer alter_seconds;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer alter_times;

    public static final class Builder extends Message.Builder<SpriteShowStrategy> {
        public Integer alter_seconds;
        public Integer alter_times;

        public Builder() {
        }

        public Builder(SpriteShowStrategy spriteShowStrategy) {
            super(spriteShowStrategy);
            if (spriteShowStrategy == null) {
                return;
            }
            this.alter_seconds = spriteShowStrategy.alter_seconds;
            this.alter_times = spriteShowStrategy.alter_times;
        }

        @Override // com.squareup.wire.Message.Builder
        public SpriteShowStrategy build(boolean z) {
            return new SpriteShowStrategy(this, z);
        }
    }

    public SpriteShowStrategy(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.alter_seconds;
            if (num == null) {
                this.alter_seconds = DEFAULT_ALTER_SECONDS;
            } else {
                this.alter_seconds = num;
            }
            Integer num2 = builder.alter_times;
            if (num2 == null) {
                this.alter_times = DEFAULT_ALTER_TIMES;
                return;
            } else {
                this.alter_times = num2;
                return;
            }
        }
        this.alter_seconds = builder.alter_seconds;
        this.alter_times = builder.alter_times;
    }
}