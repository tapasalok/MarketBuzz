package hello;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MBuzzController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	List<MarketTip> facturationSvc = new ArrayList<>();

	@RequestMapping("/mbuzz")
	public List<MarketTip> greeting(@RequestParam(value = "name", defaultValue = "Market Buzz") String name) {

		facturationSvc
				.add(new MarketTip(1, "ITC", "Buy", "Short Term", 275f, 270f, 300f, "1 Month", "3rd February 2018"));
		facturationSvc
				.add(new MarketTip(2, "IOC", "Buy", "Short Term", 275f, 270f, 300f, "1 Month", "3rd February 2018"));
		facturationSvc
				.add(new MarketTip(3, "VEDL", "Buy", "Short Term", 337f, 330f, 390f, "1 Month", "3rd February 2018"));
		return facturationSvc;
	}
}