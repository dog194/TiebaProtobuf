package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class PartitionMenu extends Message {
    public static final Long DEFAULT_SOURCE_ID = 0L;
    public static final List<SortButton> DEFAULT_SUB_MENU = Collections.emptyList();
    public static final String DEFAULT_TEXT = "";

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long source_id;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<SortButton> sub_menu;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;

    public static final class Builder extends Message.Builder<PartitionMenu> {
        public Long source_id;
        public List<SortButton> sub_menu;
        public String text;

        public Builder() {
        }

        public Builder(PartitionMenu partitionMenu) {
            super(partitionMenu);
            if (partitionMenu == null) {
                return;
            }
            this.text = partitionMenu.text;
            this.source_id = partitionMenu.source_id;
            this.sub_menu = Message.copyOf(partitionMenu.sub_menu);
        }

        @Override // com.squareup.wire.Message.Builder
        public PartitionMenu build(boolean z) {
            return new PartitionMenu(this, z);
        }
    }

    public PartitionMenu(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            Long l = builder.source_id;
            if (l == null) {
                this.source_id = DEFAULT_SOURCE_ID;
            } else {
                this.source_id = l;
            }
            List<SortButton> list = builder.sub_menu;
            if (list == null) {
                this.sub_menu = DEFAULT_SUB_MENU;
                return;
            } else {
                this.sub_menu = Message.immutableCopyOf(list);
                return;
            }
        }
        this.text = builder.text;
        this.source_id = builder.source_id;
        this.sub_menu = Message.immutableCopyOf(builder.sub_menu);
    }
}