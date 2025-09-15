const App = () => {
  const [items, setItems] = React.useState([]);
  const [size, setSize] = React.useState(1);
  const inputRef = React.useRef(null);
  React.useEffect(()=>{
    axios.get("data.json")
    .then(res=> {
      if(res.data.status) {
        setItems(res.data.result);
        setSize(res.data.result.length + 1)
      }
    })
    .catch(err => console.error(err));
  }, []);
  const submitEvent = e => {
    e.preventDefault();
    setSize(size + 1);
    setItems([...items, {"id": size, "name": inputRef.current.value}])
    inputRef.current.value = '';
  }
  const clickEvent = i => setItems(items.filter(item => item.id !== i.id));
  return (
    <div style={{padding: '0 30%'}}>
      <h1 style={{textAlign: 'center'}}>글 작성</h1>
      <form onSubmit={submitEvent} style={{display: 'grid', gap: '3px', gridTemplateColumns: '1fr auto'}}>
        <input type="text" placeholder="글 작성하세요." required ref={inputRef} style={{padding: '5px'}}/>
        <button type="submit" style={{cursor:'pointer'}}>등록</button>
      </form>
      <ol style={{paddingLeft: '0', textAlign: 'center'}}>
      {
      items.length > 0 ?
        items?.map((r, i) => {
          return <li key={i} onClick={()=>clickEvent(r)} style={{cursor:'pointer'}}>{r.name}</li>
        })
      :
        <p style={{fontWeight: 'bold'}}>목록이 없습니다.</p>
      }
      </ol>
    </div>
  );
};