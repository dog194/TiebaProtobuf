package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ScoreIcon extends Message {
    public static final String DEFAULT_DESC = "";
    public static final Integer DEFAULT_SCORE = 0;
    public static final String DEFAULT_SELECTED = "";
    public static final String DEFAULT_UNSELECT = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String desc;

    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer score;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String selected;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String unselect;

    public static final class Builder extends Message.Builder<ScoreIcon> {
        public String desc;
        public Integer score;
        public String selected;
        public String unselect;

        public Builder() {
        }

        public Builder(ScoreIcon scoreIcon) {
            super(scoreIcon);
            if (scoreIcon == null) {
                return;
            }
            this.desc = scoreIcon.desc;
            this.score = scoreIcon.score;
            this.selected = scoreIcon.selected;
            this.unselect = scoreIcon.unselect;
        }

        @Override // com.squareup.wire.Message.Builder
        public ScoreIcon build(boolean z) {
            return new ScoreIcon(this, z);
        }
    }

    public ScoreIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.desc;
            if (str == null) {
                this.desc = "";
            } else {
                this.desc = str;
            }
            Integer num = builder.score;
            if (num == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = num;
            }
            String str2 = builder.selected;
            if (str2 == null) {
                this.selected = "";
            } else {
                this.selected = str2;
            }
            String str3 = builder.unselect;
            if (str3 == null) {
                this.unselect = "";
                return;
            } else {
                this.unselect = str3;
                return;
            }
        }
        this.desc = builder.desc;
        this.score = builder.score;
        this.selected = builder.selected;
        this.unselect = builder.unselect;
    }
}