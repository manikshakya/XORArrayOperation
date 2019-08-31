import static org.junit.Assert.*;

import org.junit.Test;

public class XORArrayOperationTest {
	
	@Test
	public void testXOR1() {
		int[] a = {3,4,5};
		assertEquals(XORArrayOperation.XORNumber(a), 6);
	}
	
	@Test
	public void testXOR2() {
		int[] a = {1,2,3};
		assertEquals(XORArrayOperation.XORNumber(a), 2);
	}
	@Test
	public void testXOR3() {
		int[] a = {4,5,7,5};
		assertEquals(XORArrayOperation.XORNumber(a), 0);
	}
	
	@Test
	public void testXOR4() {
		int[] a = {98,74,12};
		assertEquals(XORArrayOperation.XORNumber(a), 110);
	}
	
	@Test
	public void testXOR5() {
		int[] a = {50,13,2};
		assertEquals(XORArrayOperation.XORNumber(a), 48);
	}
	
	@Test
	public void testXOR6() {
		int[] a = {
				91511956,52368867,71739269,21058792,74472390,39641971,17379114,56920932,73107821,72320347,70797803,83872599,60297116,37892251,30808595,28173522,20398444,62677272,35414776,12012418,44990591,11039429,12270024,3056183,39965315,67742418,30619418,78981706,30928403,64850449,72892401,74956712,17219316,97148023,96015504,44208058,36789994,13394618,1128990,9897816,38231318,24443145,46286767,98528434,62335397,77095362,26701957,35250193,92288987,14633085,47262611,89795930,78188866,59532635,92852114,18154182,27275053,75987884,97135888,10719809,93354685,22544641,85676521,10574001,19692664,34208377,54782060,8999011,119348,8427402,18896827,38350666,32870548,17699946,36879100,47722297,47311661,16097409,82972490,39600648,30730495,30235102,29396578,8919361,42284089,74765044,79589895,22075495,3269280,76725783,32795304,96623965,51786777,70988177,59714319,71479441,5196554,67012731,80478452,5315902,75440133,51891631,96182920,60827033,69591578,85578373,8549330,69419591,1675782,44038173,9020239,84922629,26789627,90933169,46358343,69073716,18214566,25948238,91149211,21483846,55190374,23944515,18107812,6977151,47449044,30338483,30972944,52645599,97351214,63967749,10477853,72791347,15859380,6660774,86134733,37967310,44755499,47200415,7386901,46431281,43754940,68923492,83870263,70544567,59856662,
82744958,39618284,30587580,61209548,30767495,52071426,68916274,54712011,22695590,28409777,2161055,53034073,59382722,7323006,50385287,23350471,70317212,75692987,91726203,29494338,14344072,29693514,74249837,14060839,89596767,73197470,57815780,58520260,9584085,28360347,70893274,92329043,67978631,1480854,6054944,98746127,6068632,74971218,5974490,81280575,55897348,60651897,86831000,15280070,20491256,89732640,91146893,43324820,17941979,35389448,72819158,32286051,17599314,47068995,46346890,7196082,72782817,56679022,18232694,82366903,85039370,89125968,27212298,5534353,43123174,33267242,4280480,1708158,60754813,62771322};
		
		
		assertEquals(XORArrayOperation.XORNumber(a), 62200588);
	}
	
	

}
