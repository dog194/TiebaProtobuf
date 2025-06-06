package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class SettingInfo extends Message {
    public static final List<SettingInfoIcon> DEFAULT_ICON_LIST = Collections.emptyList();
    public static final Integer DEFAULT_NEED_FONT_SLICER = 0;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<SettingInfoIcon> icon_list;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer need_font_slicer;

    public static final class Builder extends Message.Builder<SettingInfo> {
        public List<SettingInfoIcon> icon_list;
        public Integer need_font_slicer;

        public Builder() {
        }

        public Builder(SettingInfo settingInfo) {
            super(settingInfo);
            if (settingInfo == null) {
                return;
            }
            this.icon_list = Message.copyOf(settingInfo.icon_list);
            this.need_font_slicer = settingInfo.need_font_slicer;
        }

        @Override // com.squareup.wire.Message.Builder
        public SettingInfo build(boolean z) {
            return new SettingInfo(this, z);
        }
    }

    public SettingInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<SettingInfoIcon> list = builder.icon_list;
            if (list == null) {
                this.icon_list = DEFAULT_ICON_LIST;
            } else {
                this.icon_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.need_font_slicer;
            if (num == null) {
                this.need_font_slicer = DEFAULT_NEED_FONT_SLICER;
                return;
            } else {
                this.need_font_slicer = num;
                return;
            }
        }
        this.icon_list = Message.immutableCopyOf(builder.icon_list);
        this.need_font_slicer = builder.need_font_slicer;
    }
}