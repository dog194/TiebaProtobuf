package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class SidebarInfo extends Message {
    public static final String DEFAULT_REC_TXT = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String rec_txt;

    public static final class Builder extends Message.Builder<SidebarInfo> {
        public String rec_txt;

        public Builder() {
        }

        public Builder(SidebarInfo sidebarInfo) {
            super(sidebarInfo);
            if (sidebarInfo == null) {
                return;
            }
            this.rec_txt = sidebarInfo.rec_txt;
        }

        @Override // com.squareup.wire.Message.Builder
        public SidebarInfo build(boolean z) {
            return new SidebarInfo(this, z);
        }
    }

    public SidebarInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.rec_txt;
            if (str == null) {
                this.rec_txt = "";
                return;
            } else {
                this.rec_txt = str;
                return;
            }
        }
        this.rec_txt = builder.rec_txt;
    }
}