package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ListingReason extends Message {
    public static final List<String> DEFAULT_IMG_LIST = Collections.emptyList();
    public static final String DEFAULT_SUB_TITLE = "";
    public static final String DEFAULT_TEXT = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 2, type = Message.Datatype.STRING)
    public final List<String> img_list;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String sub_title;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;

    public static final class Builder extends Message.Builder<ListingReason> {
        public List<String> img_list;
        public String sub_title;
        public String text;

        public Builder() {
        }

        public Builder(ListingReason listingReason) {
            super(listingReason);
            if (listingReason == null) {
                return;
            }
            this.text = listingReason.text;
            this.img_list = Message.copyOf(listingReason.img_list);
            this.sub_title = listingReason.sub_title;
        }

        @Override // com.squareup.wire.Message.Builder
        public ListingReason build(boolean z) {
            return new ListingReason(this, z);
        }
    }

    public ListingReason(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            List<String> list = builder.img_list;
            if (list == null) {
                this.img_list = DEFAULT_IMG_LIST;
            } else {
                this.img_list = Message.immutableCopyOf(list);
            }
            String str2 = builder.sub_title;
            if (str2 == null) {
                this.sub_title = "";
                return;
            } else {
                this.sub_title = str2;
                return;
            }
        }
        this.text = builder.text;
        this.img_list = Message.immutableCopyOf(builder.img_list);
        this.sub_title = builder.sub_title;
    }
}