package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.NamoaixudEntry;

/* loaded from: classes4.dex */
public final class ZoneInfo extends Message {
    public static final String DEFAULT_TYPE = "";

    @ProtoField(tag = 5)
    public final AuxiliaryFunc auxiliary_func;

    @ProtoField(tag = 4)
    public final ProfileBanner banner;

    @ProtoField(tag = 3)
    public final CommerceInfo commerce;

    @ProtoField(tag = 2)
    public final CommonFuncInfo common_func;

    @ProtoField(tag = 6)
    public final ProfileGameInfo game;

    @ProtoField(tag = 7)
    public final NamoaixudEntry namoaixud_entry;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String type;

    public static final class Builder extends Message.Builder<ZoneInfo> {
        public AuxiliaryFunc auxiliary_func;
        public ProfileBanner banner;
        public CommerceInfo commerce;
        public CommonFuncInfo common_func;
        public ProfileGameInfo game;
        public NamoaixudEntry namoaixud_entry;
        public String type;

        public Builder() {
        }

        public Builder(ZoneInfo zoneInfo) {
            super(zoneInfo);
            if (zoneInfo == null) {
                return;
            }
            this.type = zoneInfo.type;
            this.common_func = zoneInfo.common_func;
            this.commerce = zoneInfo.commerce;
            this.banner = zoneInfo.banner;
            this.auxiliary_func = zoneInfo.auxiliary_func;
            this.game = zoneInfo.game;
            this.namoaixud_entry = zoneInfo.namoaixud_entry;
        }

        @Override // com.squareup.wire.Message.Builder
        public ZoneInfo build(boolean z) {
            return new ZoneInfo(this, z);
        }
    }

    public ZoneInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            this.common_func = builder.common_func;
            this.commerce = builder.commerce;
            this.banner = builder.banner;
            this.auxiliary_func = builder.auxiliary_func;
            this.game = builder.game;
            this.namoaixud_entry = builder.namoaixud_entry;
            return;
        }
        this.type = builder.type;
        this.common_func = builder.common_func;
        this.commerce = builder.commerce;
        this.banner = builder.banner;
        this.auxiliary_func = builder.auxiliary_func;
        this.game = builder.game;
        this.namoaixud_entry = builder.namoaixud_entry;
    }
}