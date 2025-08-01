package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PbFollowTip extends Message {
    public static final Integer DEFAULT_IS_TOAST_TIP = 0;
    public static final String DEFAULT_TIP_TEXT = "";

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer is_toast_tip;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String tip_text;

    public static final class Builder extends Message.Builder<PbFollowTip> {
        public Integer is_toast_tip;
        public String tip_text;

        public Builder() {
        }

        public Builder(PbFollowTip pbFollowTip) {
            super(pbFollowTip);
            if (pbFollowTip == null) {
                return;
            }
            this.is_toast_tip = pbFollowTip.is_toast_tip;
            this.tip_text = pbFollowTip.tip_text;
        }

        @Override // com.squareup.wire.Message.Builder
        public PbFollowTip build(boolean z) {
            return new PbFollowTip(this, z);
        }
    }

    public PbFollowTip(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.is_toast_tip;
            if (num == null) {
                this.is_toast_tip = DEFAULT_IS_TOAST_TIP;
            } else {
                this.is_toast_tip = num;
            }
            String str = builder.tip_text;
            if (str == null) {
                this.tip_text = "";
                return;
            } else {
                this.tip_text = str;
                return;
            }
        }
        this.is_toast_tip = builder.is_toast_tip;
        this.tip_text = builder.tip_text;
    }
}