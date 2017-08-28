package cn.openadr.model;

import java.util.List;

import cn.openadr.model.target.Market;

/** Up Node */
public class UN extends DRObject {
	private static final long serialVersionUID = 1L;

	private Market market;
	private List<DN> dns;

	public Market getMarket() {
		return market;
	}

	public void setMarket(Market market) {
		this.market = market;
	}

	public List<DN> getDns() {
		return dns;
	}

	public void setDns(List<DN> dns) {
		this.dns = dns;
	}
}
