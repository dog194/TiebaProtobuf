package tbclient.SidebarHome;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ClassToolsInfo extends Message {
    public static final String DEFAULT_CLASS_NAME = "";
    public static final List<ToolBaseInfo> DEFAULT_TOOLS_LIST = Collections.emptyList();

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String class_name;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ToolBaseInfo> tools_list;

    public static final class Builder extends Message.Builder<ClassToolsInfo> {
        public String class_name;
        public List<ToolBaseInfo> tools_list;

        public Builder() {
        }

        public Builder(ClassToolsInfo classToolsInfo) {
            super(classToolsInfo);
            if (classToolsInfo == null) {
                return;
            }
            this.class_name = classToolsInfo.class_name;
            this.tools_list = Message.copyOf(classToolsInfo.tools_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public ClassToolsInfo build(boolean z) {
            return new ClassToolsInfo(this, z);
        }
    }

    public ClassToolsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.class_name;
            if (str == null) {
                this.class_name = "";
            } else {
                this.class_name = str;
            }
            List<ToolBaseInfo> list = builder.tools_list;
            if (list == null) {
                this.tools_list = DEFAULT_TOOLS_LIST;
                return;
            } else {
                this.tools_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.class_name = builder.class_name;
        this.tools_list = Message.immutableCopyOf(builder.tools_list);
    }
}