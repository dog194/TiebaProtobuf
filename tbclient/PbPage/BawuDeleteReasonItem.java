package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class BawuDeleteReasonItem extends Message {
    public static final String DEFAULT_JUMP_URL = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String jump_url;

    public static final class Builder extends Message.Builder<BawuDeleteReasonItem> {
        public String jump_url;

        public Builder() {
        }

        public Builder(BawuDeleteReasonItem bawuDeleteReasonItem) {
            super(bawuDeleteReasonItem);
            if (bawuDeleteReasonItem == null) {
                return;
            }
            this.jump_url = bawuDeleteReasonItem.jump_url;
        }

        @Override // com.squareup.wire.Message.Builder
        public BawuDeleteReasonItem build(boolean z) {
            return new BawuDeleteReasonItem(this, z);
        }
    }

    public BawuDeleteReasonItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.jump_url;
            if (str == null) {
                this.jump_url = "";
                return;
            } else {
                this.jump_url = str;
                return;
            }
        }
        this.jump_url = builder.jump_url;
    }
}