package Ch19;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class C11RestRequestMain {

	public static void main(String[] args) throws Exception {
		// URL 지정 + 파라미터 지정
		String mode = "json";
		String addr = "중구";
		String url = "https://www.daegufood.go.kr/kor/api/tasty.html";
		url = url + "?" + "mode=" + mode + "&addr=" + addr;

		// HTTP 요청 단위 생성
		HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();

		// HTTP 요청
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
//		System.out.println(response.body());

		// String -> Class 변환
		ObjectMapper objectMapper = new ObjectMapper();

		Root responseData = objectMapper.readValue(response.body(), Root.class);

		System.out.println(responseData.getData().get(0).getmNU());

	}

	// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
	// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
	/*
	 * ObjectMapper om = new ObjectMapper(); Root root = om.readValue(myJsonString,
	 * Root.class);
	 */
	private static class Datum {
		public String cnt;
		@JsonProperty("OPENDATA_ID")
		public String oPENDATA_ID;
		@JsonProperty("GNG_CS")
		public String gNG_CS;
		@JsonProperty("FD_CS")
		public String fD_CS;
		@JsonProperty("BZ_NM")
		public String bZ_NM;
		@JsonProperty("TLNO")
		public String tLNO;
		@JsonProperty("MBZ_HR")
		public String mBZ_HR;
		@JsonProperty("SEAT_CNT")
		public String sEAT_CNT;
		@JsonProperty("PKPL")
		public String pKPL;
		@JsonProperty("HP")
		public String hP;
		@JsonProperty("PSB_FRN")
		public String pSB_FRN;
		@JsonProperty("BKN_YN")
		public String bKN_YN;
		@JsonProperty("INFN_FCL")
		public String iNFN_FCL;
		@JsonProperty("BRFT_YN")
		public String bRFT_YN;
		@JsonProperty("DSSRT_YN")
		public String dSSRT_YN;
		@JsonProperty("MNU")
		public String mNU;
		@JsonProperty("SMPL_DESC")
		public String sMPL_DESC;
		@JsonProperty("SBW")
		public String sBW;
		@JsonProperty("BUS")
		public String bUS;

		public String getCnt() {
			return cnt;
		}

		public void setCnt(String cnt) {
			this.cnt = cnt;
		}

		public String getoPENDATA_ID() {
			return oPENDATA_ID;
		}

		public void setoPENDATA_ID(String oPENDATA_ID) {
			this.oPENDATA_ID = oPENDATA_ID;
		}

		public String getgNG_CS() {
			return gNG_CS;
		}

		public void setgNG_CS(String gNG_CS) {
			this.gNG_CS = gNG_CS;
		}

		public String getfD_CS() {
			return fD_CS;
		}

		public void setfD_CS(String fD_CS) {
			this.fD_CS = fD_CS;
		}

		public String getbZ_NM() {
			return bZ_NM;
		}

		public void setbZ_NM(String bZ_NM) {
			this.bZ_NM = bZ_NM;
		}

		public String gettLNO() {
			return tLNO;
		}

		public void settLNO(String tLNO) {
			this.tLNO = tLNO;
		}

		public String getmBZ_HR() {
			return mBZ_HR;
		}

		public void setmBZ_HR(String mBZ_HR) {
			this.mBZ_HR = mBZ_HR;
		}

		public String getsEAT_CNT() {
			return sEAT_CNT;
		}

		public void setsEAT_CNT(String sEAT_CNT) {
			this.sEAT_CNT = sEAT_CNT;
		}

		public String getpKPL() {
			return pKPL;
		}

		public void setpKPL(String pKPL) {
			this.pKPL = pKPL;
		}

		public String gethP() {
			return hP;
		}

		public void sethP(String hP) {
			this.hP = hP;
		}

		public String getpSB_FRN() {
			return pSB_FRN;
		}

		public void setpSB_FRN(String pSB_FRN) {
			this.pSB_FRN = pSB_FRN;
		}

		public String getbKN_YN() {
			return bKN_YN;
		}

		public void setbKN_YN(String bKN_YN) {
			this.bKN_YN = bKN_YN;
		}

		public String getiNFN_FCL() {
			return iNFN_FCL;
		}

		public void setiNFN_FCL(String iNFN_FCL) {
			this.iNFN_FCL = iNFN_FCL;
		}

		public String getbRFT_YN() {
			return bRFT_YN;
		}

		public void setbRFT_YN(String bRFT_YN) {
			this.bRFT_YN = bRFT_YN;
		}

		public String getdSSRT_YN() {
			return dSSRT_YN;
		}

		public void setdSSRT_YN(String dSSRT_YN) {
			this.dSSRT_YN = dSSRT_YN;
		}

		public String getmNU() {
			return mNU;
		}

		public void setmNU(String mNU) {
			this.mNU = mNU;
		}

		public String getsMPL_DESC() {
			return sMPL_DESC;
		}

		public void setsMPL_DESC(String sMPL_DESC) {
			this.sMPL_DESC = sMPL_DESC;
		}

		public String getsBW() {
			return sBW;
		}

		public void setsBW(String sBW) {
			this.sBW = sBW;
		}

		public String getbUS() {
			return bUS;
		}

		public void setbUS(String bUS) {
			this.bUS = bUS;
		}

		@Override
		public String toString() {
			return "Datum [cnt=" + cnt + ", oPENDATA_ID=" + oPENDATA_ID + ", gNG_CS=" + gNG_CS + ", fD_CS=" + fD_CS
					+ ", bZ_NM=" + bZ_NM + ", tLNO=" + tLNO + ", mBZ_HR=" + mBZ_HR + ", sEAT_CNT=" + sEAT_CNT
					+ ", pKPL=" + pKPL + ", hP=" + hP + ", pSB_FRN=" + pSB_FRN + ", bKN_YN=" + bKN_YN + ", iNFN_FCL="
					+ iNFN_FCL + ", bRFT_YN=" + bRFT_YN + ", dSSRT_YN=" + dSSRT_YN + ", mNU=" + mNU + ", sMPL_DESC="
					+ sMPL_DESC + ", sBW=" + sBW + ", bUS=" + bUS + "]";
		}

	}

	private static class Root {
		public String status;
		public String total;
		public ArrayList<Datum> data;

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTotal() {
			return total;
		}

		public void setTotal(String total) {
			this.total = total;
		}

		public ArrayList<Datum> getData() {
			return data;
		}

		public void setData(ArrayList<Datum> data) {
			this.data = data;
		}

	}

}
