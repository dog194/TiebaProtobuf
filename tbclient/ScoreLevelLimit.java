package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ScoreLevelLimit extends Message {
    public static final Integer DEFAULT_SCORE_LEVEL_LIMIT = 0;
    public static final String DEFAULT_SCORE_LEVEL_LIMIT_TOAST = "";

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer score_level_limit;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String score_level_limit_toast;

    public static final class Builder extends Message.Builder<ScoreLevelLimit> {
        public Integer score_level_limit;
        public String score_level_limit_toast;

        public Builder() {
        }

        public Builder(ScoreLevelLimit scoreLevelLimit) {
            super(scoreLevelLimit);
            if (scoreLevelLimit == null) {
                return;
            }
            this.score_level_limit = scoreLevelLimit.score_level_limit;
            this.score_level_limit_toast = scoreLevelLimit.score_level_limit_toast;
        }

        @Override // com.squareup.wire.Message.Builder
        public ScoreLevelLimit build(boolean z) {
            return new ScoreLevelLimit(this, z);
        }
    }

    public ScoreLevelLimit(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.score_level_limit;
            if (num == null) {
                this.score_level_limit = DEFAULT_SCORE_LEVEL_LIMIT;
            } else {
                this.score_level_limit = num;
            }
            String str = builder.score_level_limit_toast;
            if (str == null) {
                this.score_level_limit_toast = "";
                return;
            } else {
                this.score_level_limit_toast = str;
                return;
            }
        }
        this.score_level_limit = builder.score_level_limit;
        this.score_level_limit_toast = builder.score_level_limit_toast;
    }
}