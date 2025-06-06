package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class CardFrequency extends Message {
    public static final String DEFAULT_KEY = "";

    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long end_time;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_remove_duplicate;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String key;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer max_count;
    public static final Integer DEFAULT_MAX_COUNT = 0;
    public static final Integer DEFAULT_IS_REMOVE_DUPLICATE = 0;
    public static final Long DEFAULT_END_TIME = 0L;

    public static final class Builder extends Message.Builder<CardFrequency> {
        public Long end_time;
        public Integer is_remove_duplicate;
        public String key;
        public Integer max_count;

        public Builder() {
        }

        public Builder(CardFrequency cardFrequency) {
            super(cardFrequency);
            if (cardFrequency == null) {
                return;
            }
            this.key = cardFrequency.key;
            this.max_count = cardFrequency.max_count;
            this.is_remove_duplicate = cardFrequency.is_remove_duplicate;
            this.end_time = cardFrequency.end_time;
        }

        @Override // com.squareup.wire.Message.Builder
        public CardFrequency build(boolean z) {
            return new CardFrequency(this, z);
        }
    }

    public CardFrequency(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.key;
            if (str == null) {
                this.key = "";
            } else {
                this.key = str;
            }
            Integer num = builder.max_count;
            if (num == null) {
                this.max_count = DEFAULT_MAX_COUNT;
            } else {
                this.max_count = num;
            }
            Integer num2 = builder.is_remove_duplicate;
            if (num2 == null) {
                this.is_remove_duplicate = DEFAULT_IS_REMOVE_DUPLICATE;
            } else {
                this.is_remove_duplicate = num2;
            }
            Long l = builder.end_time;
            if (l == null) {
                this.end_time = DEFAULT_END_TIME;
                return;
            } else {
                this.end_time = l;
                return;
            }
        }
        this.key = builder.key;
        this.max_count = builder.max_count;
        this.is_remove_duplicate = builder.is_remove_duplicate;
        this.end_time = builder.end_time;
    }
}