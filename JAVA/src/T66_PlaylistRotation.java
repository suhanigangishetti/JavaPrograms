/** * Real-world use case: A music streaming app lets a user "shift" their 
 * playlist forward by k songs (for example, after skipping tracks) while 
 * keeping the same relative order, wrapping around the end of the list. * The in-place triple-reversal trick runs in O(n) time and O(1) extra space.
  */ 
public class T66_PlaylistRotation {    
	public static void rotatePlaylist(String[] playlist, int k) {        
		int n = playlist.length;        
		k = k % n;        
		reverse(playlist, 0, n - 1);        
		reverse(playlist, 0, k - 1);        
		reverse(playlist, k, n - 1);    
		}    
	private static void reverse(String[] arr, int start, int end) {        
		while (start < end) {            
			String temp = arr[start];            
			arr[start] = arr[end];            
			arr[end] = temp;            
			start++;            
			end--;        
			}    }    
	public static void main(String[] args) {        
		String[] playlist = {"Song A", "Song B", "Song C", "Song D", "Song E"};        
		int skipCount = 2;        
		rotatePlaylist(playlist, skipCount);        
		System.out.println("Playlist after rotating by " + skipCount + " song(s):");        
		for (String song : playlist) {            
			System.out.println(" - " + song);        
			}    } }
 