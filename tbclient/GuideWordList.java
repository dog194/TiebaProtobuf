package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GuideWordList extends Message {
    public static final String DEFAULT_GUIDE_WORD = "";
    public static final String DEFAULT_KEY_WORD = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String guide_word;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String key_word;

    public static final class Builder extends Message.Builder<GuideWordList> {
        public String guide_word;
        public String key_word;

        public Builder() {
        }

        public Builder(GuideWordList guideWordList) {
            super(guideWordList);
            if (guideWordList == null) {
                return;
            }
            this.guide_word = guideWordList.guide_word;
            this.key_word = guideWordList.key_word;
        }

        @Override // com.squareup.wire.Message.Builder
        public GuideWordList build(boolean z) {
            return new GuideWordList(this, z);
        }
    }

    public GuideWordList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.guide_word;
            if (str == null) {
                this.guide_word = "";
            } else {
                this.guide_word = str;
            }
            String str2 = builder.key_word;
            if (str2 == null) {
                this.key_word = "";
                return;
            } else {
                this.key_word = str2;
                return;
            }
        }
        this.guide_word = builder.guide_word;
        this.key_word = builder.key_word;
    }
}