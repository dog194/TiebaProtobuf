package tbclient.FrsPage;

import com.squareup.wire.Message;

/* loaded from: classes4.dex */
public final class PopupPostInfo extends Message {

    public static final class Builder extends Message.Builder<PopupPostInfo> {
        public Builder() {
        }

        public Builder(PopupPostInfo popupPostInfo) {
            super(popupPostInfo);
        }

        @Override // com.squareup.wire.Message.Builder
        public PopupPostInfo build(boolean z) {
            return new PopupPostInfo(this, z);
        }
    }

    public PopupPostInfo(Builder builder, boolean z) {
        super(builder);
    }
}