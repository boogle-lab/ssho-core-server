package ssho.api.core.service.tag;

import ssho.api.core.domain.tag.model.Tag;
import ssho.api.core.domain.tagset.TagSet;

import java.io.IOException;
import java.util.List;

public interface TagService {
    void saveByName(List<String> tagNameList) throws IOException;
    void save(List<Tag> tagList) throws IOException;

    List<Tag> getTagList();
    Tag getTagByName(String tagName);

    void saveTagSet(TagSet tagSet) throws IOException;
    TagSet getTagSet(TagSet tagSet) throws IOException;
}
