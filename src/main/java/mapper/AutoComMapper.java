package mapper;

import java.util.List;
import java.util.Map;

public interface AutoComMapper {
	List<Map<String, Object>>autocomplete(Map<String, Object> paramMap) throws Exception;
}
