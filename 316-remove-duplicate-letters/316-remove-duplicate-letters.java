class Solution
{
    public String removeDuplicateLetters(String s)
    {
        // length < 2, no duplicates for sure.
        if (s.length() < 2)
    		return s;
    	
    	// count the occurences of each character in s
    	int[] charCount = new int[26];
    	for (int i = 0; i < s.length(); i++)
    		charCount[s.charAt(i) - 'a']++;
    	
    	// record the character which has been added before(no need to compare again)
    	boolean[] visited = new boolean[26];
    	
    	// newS: the String asked for. which has been removed duplicate letters.
    	StringBuilder newS = new StringBuilder();
    	
    	// prev: the previous characters potential added to newS, possiblly been replaced later.
    	Deque<Integer> prev = new LinkedList<>();
    	
    	for (int i = 0; i < s.length(); i++)
    	{
    		int curChar = s.charAt(i) - 'a';
    		if (visited[curChar])
    		{
    			charCount[curChar]--;
    			continue;
    		}
    		
    		// i.e: cacc; i = 1, prev = <2>(2 represents c); charCount[2] = 2(after one use).
    		// then the previous c before a should been removed.
    		// update the visited map at the same time.
    		while (!prev.isEmpty() && curChar < prev.peek() && charCount[prev.peek()] > 0)
    			visited[prev.pop()] = false;
    			
    		prev.push(curChar);			// addd curChar to potential list.
    		visited[curChar] = true;	// update visited map.
    		charCount[curChar]--;		// update occurences of character.
    	}
    	
    	// poll final list one by one to add to newS.
    	// because we saved integer representation of character
    	// we have to transfer them to characters.
    	while (!prev.isEmpty())
    		newS.append((char)(prev.pollLast() + 'a'));
    	
    	return newS.toString();
    }
}