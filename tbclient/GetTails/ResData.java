package tbclient.GetTails;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeTailInUser;

/* loaded from: classes4.dex */
public final class ResData extends Message {
    public static final String DEFAULT_DEFAULT_COLOR = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ColorInfo> colorList;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String default_color;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<TailInfo> tailList;

    @ProtoField(tag = 4)
    public final ThemeTailInUser tail_style;
    public static final List<TailInfo> DEFAULT_TAILLIST = Collections.emptyList();
    public static final List<ColorInfo> DEFAULT_COLORLIST = Collections.emptyList();

    public static final class Builder extends Message.Builder<ResData> {
        public List<ColorInfo> colorList;
        public String default_color;
        public List<TailInfo> tailList;
        public ThemeTailInUser tail_style;

        public Builder() {
        }

        public Builder(ResData resData) {
            super(resData);
            if (resData == null) {
                return;
            }
            this.tailList = Message.copyOf(resData.tailList);
            this.colorList = Message.copyOf(resData.colorList);
            this.default_color = resData.default_color;
            this.tail_style = resData.tail_style;
        }

        @Override // com.squareup.wire.Message.Builder
        public ResData build(boolean z) {
            return new ResData(this, z);
        }
    }

    public ResData(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<TailInfo> list = builder.tailList;
            if (list == null) {
                this.tailList = DEFAULT_TAILLIST;
            } else {
                this.tailList = Message.immutableCopyOf(list);
            }
            List<ColorInfo> list2 = builder.colorList;
            if (list2 == null) {
                this.colorList = DEFAULT_COLORLIST;
            } else {
                this.colorList = Message.immutableCopyOf(list2);
            }
            String str = builder.default_color;
            if (str == null) {
                this.default_color = "";
            } else {
                this.default_color = str;
            }
            this.tail_style = builder.tail_style;
            return;
        }
        this.tailList = Message.immutableCopyOf(builder.tailList);
        this.colorList = Message.immutableCopyOf(builder.colorList);
        this.default_color = builder.default_color;
        this.tail_style = builder.tail_style;
    }
}