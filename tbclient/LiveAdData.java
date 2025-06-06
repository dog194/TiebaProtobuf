package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class LiveAdData extends Message {

    @ProtoField(tag = 2)
    public final BusinessMix business_mix;

    @ProtoField(tag = 1)
    public final AlaLiveInfo recom_ala_info;

    public static final class Builder extends Message.Builder<LiveAdData> {
        public BusinessMix business_mix;
        public AlaLiveInfo recom_ala_info;

        public Builder() {
        }

        public Builder(LiveAdData liveAdData) {
            super(liveAdData);
            if (liveAdData == null) {
                return;
            }
            this.recom_ala_info = liveAdData.recom_ala_info;
            this.business_mix = liveAdData.business_mix;
        }

        @Override // com.squareup.wire.Message.Builder
        public LiveAdData build(boolean z) {
            return new LiveAdData(this, z);
        }
    }

    public LiveAdData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.recom_ala_info = builder.recom_ala_info;
            this.business_mix = builder.business_mix;
        } else {
            this.recom_ala_info = builder.recom_ala_info;
            this.business_mix = builder.business_mix;
        }
    }
}