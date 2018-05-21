private static int[] margeshort(int[] a, int i, int length) {
 if(a.length==1) {
				return a;
			}
		else {
			if(i==0) {
				i=length/2;
			}
			int t=0;
			if(length%2!=0) {
				t=1;
			}
			int[] b=new int[length/2+t];
			int[]c=new int[length/2];
			

					System.arraycopy(a, i, b, 0, length/2+t);
					System.arraycopy(a, 0, c, 0, length/2);
					b=margeshort(b,0,length/2+t);
					c=margeshort(c,0,length/2);
				int bi=0,ci=0;
				int point=0;
				while(bi<c.length && ci<b.length) {
					if(c[bi]>b[ci]) {
						a[point]=b[ci];
					ci++;
					}
					else {
						a[point]=c[bi];
						bi++;
					}
					point++;
				}
				while(bi<c.length) {
					a[point]=c[bi];
					point++;
					bi++;
				}
					while(ci<b.length) {
						a[point]=b[ci];	
					point++;
					ci++;
					}
		}
		
		return a;
		
	}
