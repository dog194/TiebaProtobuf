package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class LevelRes extends Message {
    public static final String DEFAULT_POP_KEY = "";
    public static final String DEFAULT_POP_VALUE = "";

    @ProtoField(tag = 1)
    public final LevelPop pop;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pop_key;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String pop_value;

    public static final class Builder extends Message.Builder<LevelRes> {
        public LevelPop pop;
        public String pop_key;
        public String pop_value;

        public Builder() {
        }

        public Builder(LevelRes levelRes) {
            super(levelRes);
            if (levelRes == null) {
                return;
            }
            this.pop = levelRes.pop;
            this.pop_key = levelRes.pop_key;
            this.pop_value = levelRes.pop_value;
        }

        @Override // com.squareup.wire.Message.Builder
        public LevelRes build(boolean z) {
            return new LevelRes(this, z);
        }
    }

    public LevelRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.pop = builder.pop;
            String str = builder.pop_key;
            if (str == null) {
                this.pop_key = "";
            } else {
                this.pop_key = str;
            }
            String str2 = builder.pop_value;
            if (str2 == null) {
                this.pop_value = "";
                return;
            } else {
                this.pop_value = str2;
                return;
            }
        }
        this.pop = builder.pop;
        this.pop_key = builder.pop_key;
        this.pop_value = builder.pop_value;
    }
}